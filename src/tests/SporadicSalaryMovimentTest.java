package tests;

import calculators.SporadicSalaryMovementCalculator;
import models.Employee;
import models.jobLevels.Advanced;
import models.jobLevels.Beginner;
import models.jobLevels.Intermediary;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SporadicSalaryMovimentTest {
    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee(new Beginner(), new BigDecimal("1000"), new Date()),
                new Employee(new Intermediary(), new BigDecimal("1000"), new Date()),
                new Employee(new Advanced(), new BigDecimal("1000"), new Date())
        );

        for(Employee emp: employees){
            System.out.println(SporadicSalaryMovementCalculator.calculate(emp.getSalary(), emp.getJobLevel()));
        }
    }
}
