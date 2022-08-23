package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public abstract class AnnualSalaryMovement {
    protected AnnualSalaryMovement next;

    public AnnualSalaryMovement(AnnualSalaryMovement next) {
        this.next = next;
    }

    public abstract BigDecimal calculateSalaryMovementFor(Employee employee);
}
