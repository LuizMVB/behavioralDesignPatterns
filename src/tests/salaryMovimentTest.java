package tests;

import calculators.SalaryMovementCalculator;
import models.Employee;
import models.jobTypes.Advanced;
import models.jobTypes.Beginner;
import models.jobTypes.Intermediary;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class salaryMovimentTest {
    public static void main(String [] args){
        List<Employee> employees = Arrays.asList(
                new Employee(new Beginner(), new BigDecimal("1000")),
                new Employee(new Intermediary(), new BigDecimal("1000")),
                new Employee(new Advanced(), new BigDecimal("1000"))
        );

        for(Employee emp: employees){
            System.out.println(SalaryMovementCalculator.calculate(emp.getSalary(), emp.getJobType()));
        }
    }
}
