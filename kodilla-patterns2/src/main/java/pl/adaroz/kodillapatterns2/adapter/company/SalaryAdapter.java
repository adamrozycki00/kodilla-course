package pl.adaroz.kodillapatterns2.adapter.company;

import pl.adaroz.kodillapatterns2.adapter.company.newhrsystem.Employee;
import pl.adaroz.kodillapatterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    public double totalSalary(String[][] workers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < salaries.length; i++) {
            employeeList.add(new Employee(
                    workers[i][0],
                    workers[i][1],
                    workers[i][2],
                    new BigDecimal(salaries[i])
            ));
        }
        return calculateSalaries(employeeList).doubleValue();
    }

}
