package annualSalaryMovement;

import models.Employee;

import java.math.BigDecimal;

public abstract class AnnualSalaryMovement {
    protected AnnualSalaryMovement next;

    public AnnualSalaryMovement(AnnualSalaryMovement next) {
        this.next = next;
    }

    public abstract boolean conditionToMakeMovement(Employee employee);

    public abstract BigDecimal obtainPercentageAppliedToMovement();

    public BigDecimal calculateSalaryMovementFor(Employee employee){
        if(conditionToMakeMovement(employee)){
            return employee.getSalary().multiply(obtainPercentageAppliedToMovement());
        }
        return next.calculateSalaryMovementFor(employee);
    }
}
