package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementByContributionTime extends AnnualSalaryMovement{
    public MakeAnnualSalaryMovementByContributionTime(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public BigDecimal calculateSalaryMovementFor(Employee employee) {
        if(employee.getContributionTimeInYears() > 1){
            return employee.getSalary().multiply(new BigDecimal("0.2"));
        }

        return next.calculateSalaryMovementFor(employee);
    }
}
