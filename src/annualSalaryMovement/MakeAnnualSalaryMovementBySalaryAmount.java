package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementBySalaryAmount extends AnnualSalaryMovement {
    public MakeAnnualSalaryMovementBySalaryAmount(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public BigDecimal calculateSalaryMovementFor(Employee employee) {
        BigDecimal salary = employee.getSalary();
        if(salary.compareTo(new BigDecimal("20000")) >= 0){
            return salary.multiply(new BigDecimal("0.6"));
        }
        return next.calculateSalaryMovementFor(employee);
    }
}
