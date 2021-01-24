package com.kodilla.kodillapatterns2.adapter.company;

import org.junit.jupiter.api.Test;
import com.kodilla.kodillapatterns2.adapter.company.oldhrsystem.Workers;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        //given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //when
        double totalSalary = salaryAdapter.totalSalary(workers.getWorkers(), workers.getSalaries());

        //then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }

}
