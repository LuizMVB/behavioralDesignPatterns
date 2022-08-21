package models.jobTypes;

import java.math.BigDecimal;

public class Intermediary implements JobType {
    @Override
    public BigDecimal calculateSalaryMovement(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.4"));
    }
}
