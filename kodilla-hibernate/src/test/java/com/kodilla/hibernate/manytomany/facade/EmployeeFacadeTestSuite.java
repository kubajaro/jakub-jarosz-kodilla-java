package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EmployeeFacadeTestSuite {

    @InjectMocks
    EmployeeFacade employeeFacade;

    @Mock
    EmployeeDao employeeDao;

    @Test
    void findEmployeeContainingLastnameTest() {
        //given
        List<Employee> employees = new ArrayList<>();
        String employeeLastnameContaining = "text";
        when(employeeDao.retrieveEmployeeContainingName(employeeLastnameContaining)).thenReturn(employees);

        //when
        List<Employee> result = employeeDao.retrieveEmployeeContainingName(employeeLastnameContaining);

        //
        Assertions.assertEquals(employees, result);
    }
}
