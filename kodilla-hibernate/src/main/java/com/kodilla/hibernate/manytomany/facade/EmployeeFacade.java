package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeFacade {

    private EmployeeDao employeeDao;

    public List<Employee> findEmployeeContainingLastname(String containingText) {
        List<Employee> findEmployeesContainingLastname = null;
        try {
            findEmployeesContainingLastname = employeeDao.retrieveEmployeeContainingName(containingText);
        } catch (Exception e) {
            System.out.println(e);
        }
        return findEmployeesContainingLastname;
    }
}
