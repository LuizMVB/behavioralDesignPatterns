package annualSalaryMovement;

import models.Employee;
import models.jobLevels.Advanced;
import models.jobLevels.Intermediary;
import models.jobLevels.JobLevel;

import java.math.BigDecimal;

public class MakeAnnualSalaryMovementByJobLevel extends AnnualSalaryMovement {

    public MakeAnnualSalaryMovementByJobLevel(AnnualSalaryMovement next) {
        super(next);
    }

    @Override
    public BigDecimal calculateSalaryMovementFor(Employee employee) {
        JobLevel jobLevel = employee.getJobLevel();
        if(jobLevel instanceof Advanced || jobLevel instanceof Intermediary) {
            return employee.getSalary().multiply(new BigDecimal("0.4"));
        }

        return next.calculateSalaryMovementFor(employee);
    }
}
