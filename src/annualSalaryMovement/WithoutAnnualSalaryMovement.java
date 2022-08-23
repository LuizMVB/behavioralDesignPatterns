package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public class WithoutAnnualSalaryMovement extends AnnualSalaryMovement{
    public WithoutAnnualSalaryMovement() {
        super(null);
    }

    @Override
    public BigDecimal calculateSalaryMovementFor(Employee employee) {
        return BigDecimal.ZERO;
    }
}
