package pl.adaroz.kodillapatterns2.adapter.company;

import pl.adaroz.kodillapatterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import pl.adaroz.kodillapatterns2.adapter.company.newhrsystem.Employee;
import pl.adaroz.kodillapatterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        return new CompanySalaryProcessor().calculateSalaries(employees);
    }

}
