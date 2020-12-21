package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;

@Service
public class CompanyFacade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployeesByNamePart(String namePart) {
        return employeeDao.retrieveEmployeesByNamePart("%" + namePart + "%");
    }

    public List<Company> findCompaniesByNamePart(String namePart) {
        return companyDao.retrieveCompaniesByNamePart("%" + namePart + "%");
    }

    public <S extends Company> S saveCompany(S company) {
        return companyDao.save(company);
    }

    public <S extends Employee> S saveEmployee(S employee) {
        return employeeDao.save(employee);
    }

    public void deleteCompanyById(Integer id) {
        companyDao.deleteById(id);
    }
}
