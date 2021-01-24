package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        return new CompanySalaryProcessor().calculateSalaries(employees);
    }

}
