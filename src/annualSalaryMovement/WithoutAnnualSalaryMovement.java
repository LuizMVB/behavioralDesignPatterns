package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public class WithoutAnnualSalaryMovement extends AnnualSalaryMovement{
    public WithoutAnnualSalaryMovement() {
        super(null);
    }

    @Override
    public boolean conditionToMakeMovement(Employee employee) {
        return true;
    }

    @Override
    public BigDecimal obtainPercentageAppliedToMovement() {
        return BigDecimal.ZERO;
    }
}
