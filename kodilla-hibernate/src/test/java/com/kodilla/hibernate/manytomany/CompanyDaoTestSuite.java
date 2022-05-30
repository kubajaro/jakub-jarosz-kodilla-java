package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CompanyDaoTestSuite {
//
//    @Autowired
//    private CompanyDao companyDao;
//
//    @Test
//    void testSaveManyToMany() {
//        //given
//        Employee employee1 = new Employee("Employee", "1");
//        Employee employee2 = new Employee("Employee", "2");
//        Employee employee3 = new Employee("Employee", "3");
//
//        Company company1 = new Company("Company1");
//        Company company2 = new Company("Company2");
//        Company company3 = new Company("Company3");
//
//        company1.getEmployees().add(employee1);
//        company2.getEmployees().add(employee2);
//        company2.getEmployees().add(employee3);
//        company3.getEmployees().add(employee1);
//        company3.getEmployees().add(employee3);
//
//        employee1.getCompanies().add(company1);
//        employee1.getCompanies().add(company3);
//        employee2.getCompanies().add(company2);
//        employee3.getCompanies().add(company2);
//        employee3.getCompanies().add(company3);
//
//        //when
//        companyDao.save(company1);
//        int company1Id = company1.getId();
//        companyDao.save(company2);
//        int company2Id = company2.getId();
//        companyDao.save(company3);
//        int company3Id = company3.getId();
//
//        //then
//        assertEquals(1, company1Id);
//        assertEquals(3, company2Id);
//        assertEquals(5, company3Id);
//    }
//
//    @Test
//    void testRetrieveCompanyBeginningWithName() {
//        //given
//        Company company1 = new Company("Company1");
//        Company company2 = new Company("Company2");
//        Employee employee1 = new Employee("Johm", "Smith");
//        Employee employee2 = new Employee("Karen", "Smith");
//
//        company1.getEmployees().add(employee1);
//        company2.getEmployees().add(employee2);
//        employee1.getCompanies().add(company1);
//        employee1.getCompanies().add(company2);
//
//        //when
//        companyDao.save(company1);
//        companyDao.save(company2);
//        List<Company> result = companyDao.retrieveCompanyBeginningWithName("Com");
//
//        //then
//        try{
//            assertEquals(2, result.size());
//        } finally {
//            companyDao.deleteById(company1.getId());
//            companyDao.deleteById(company2.getId());
//        }
//    }
}
