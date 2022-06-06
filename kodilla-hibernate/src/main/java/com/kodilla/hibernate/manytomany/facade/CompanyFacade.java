package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private CompanyDao companyDao;

    public List<Company> findCompanyContainingName(String containingText) {
        List<Company> findCompaniesContainingName = null;
        try {
            findCompaniesContainingName = companyDao.retrieveCompanyContainingName(containingText);
        } catch (Exception e) {
            System.out.println(e);
        }
        return findCompaniesContainingName;
    }
}
