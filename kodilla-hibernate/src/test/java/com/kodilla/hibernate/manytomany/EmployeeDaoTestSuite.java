package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void testRetrieveEmployeeWithLastName() {
        //given
        Employee employee = new Employee("John", "John");
        Employee employee1 = new Employee("Sam", "John");

        Company company = new Company("Company");
        Company company2 = new Company("Company2");

        employee.getCompanies().add(company);
        employee1.getCompanies().add(company2);
        company.getEmployees().add(employee);
        company2.getEmployees().add(employee1);

        //when
        employeeDao.save(employee);
        employeeDao.save(employee1);
        List<Employee> result = employeeDao.retrieveEmployeeWithLastName("John");

        //then
        try{
            assertEquals(2, result.size());
        }finally {
            //cleanup
            employeeDao.deleteById(employee.getId());
            employeeDao.deleteById(employee1.getId());
        }
    }
}
