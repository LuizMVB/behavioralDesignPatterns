package tests;

import calculators.AnnualSalaryMovementCalculator;
import models.Employee;
import models.jobLevels.Advanced;

import java.math.BigDecimal;
import java.util.Calendar;

public class AnnualSalaryMovementTest {
    public static void main(String [] args){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1999);
        calendar.set(Calendar.MONTH, Calendar.AUGUST);
        calendar.set(Calendar.DAY_OF_MONTH, 22);

        Employee emp = new Employee(new Advanced(), new BigDecimal("10000"), calendar.getTime());

        System.out.println(AnnualSalaryMovementCalculator.calculateFor(emp));
    }
}
