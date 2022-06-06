package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class CompanyFacadeTestSuite {

    @InjectMocks
    CompanyFacade companyFacade;

    @Mock
    CompanyDao companyDao;

    @Test
    void findCompanyContainingNameTest() {
        //given
        List<Company> companies = new ArrayList<>();
        String companyNameContaining = "text";
        when(companyDao.retrieveCompanyContainingName(companyNameContaining)).thenReturn(companies);

        //when
        List<Company> result = companyFacade.findCompanyContainingName(companyNameContaining);

        //
        Assertions.assertEquals(companies, result);
    }

}
