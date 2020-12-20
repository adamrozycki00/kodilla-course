package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.facade.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedQuery;
import java.util.List;

@NamedQuery(
        name = "Employee.retrieveEmployeesByNamePart",
        query = "from Employee where lastname like :namePart"
)
@NamedQuery(
        name = "Employee.retrieveCompaniesByNamePart",
        query = "from Company where name like :namePart"
)
@Service
public class CompanyFacade {

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> findEmployeesByNamePart(String namePart) {
        return employeeDao.retrieveEmployeesByNamePart("%" + namePart + "%");
    }

    public List<Employee> findCompaniesByNamePart(String namePart) {
        return companyDao.retrieveCompaniesByNamePart("%" + namePart + "%");
    }

}
