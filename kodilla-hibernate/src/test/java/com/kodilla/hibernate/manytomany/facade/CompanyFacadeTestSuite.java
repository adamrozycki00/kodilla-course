package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {

    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void findCompaniesByNamePartTest() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company dataMatters = new Company("Data Matters");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        dataMatters.getEmployees().add(johnSmith);
        dataMatters.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(dataMatters);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMatters);

        companyFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveCompany(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyFacade.saveCompany(dataMatters);
        int dataMattersId = dataMatters.getId();

        //when
        List<Company> retrieveContaining2 = companyFacade.findCompaniesByNamePart("ata");
        List<Company> retrieveContaining1 = companyFacade.findCompaniesByNamePart("are");
        List<Company> retrieveContaining0 = companyFacade.findCompaniesByNamePart("xxx");

        //then
        try {
            assertEquals(2, retrieveContaining2.size());
            assertEquals(1, retrieveContaining1.size());
            assertEquals(0, retrieveContaining0.size());

            //clean-up
            companyFacade.deleteCompanyById(softwareMachineId);
            companyFacade.deleteCompanyById(dataMastersId);
            companyFacade.deleteCompanyById(dataMattersId);
        } catch (Exception e) {
        }

    }

    @Test
    public void findEmployeesByNamePartTest() {
        //given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMasters = new Company("Data Masters");
        Company dataMatters = new Company("Data Matters");

        softwareMachine.getEmployees().add(johnSmith);
        dataMasters.getEmployees().add(stephanieClarckson);
        dataMasters.getEmployees().add(lindaKovalsky);
        dataMatters.getEmployees().add(johnSmith);
        dataMatters.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(dataMatters);
        stephanieClarckson.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMasters);
        lindaKovalsky.getCompanies().add(dataMatters);

        companyFacade.saveCompany(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyFacade.saveCompany(dataMasters);
        int dataMastersId = dataMasters.getId();
        companyFacade.saveCompany(dataMatters);
        int dataMattersId = dataMatters.getId();

        //when
        List<Employee> retrieveSky = companyFacade.findEmployeesByNamePart("sky");

        //then
        try {
            assertEquals(1, retrieveSky.size());

            //clean-up
            companyFacade.deleteCompanyById(softwareMachineId);
            companyFacade.deleteCompanyById(dataMastersId);
            companyFacade.deleteCompanyById(dataMattersId);
        } catch (Exception e) {
        }

    }
}