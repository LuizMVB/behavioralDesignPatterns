package jobLevels;

import java.math.BigDecimal;

public class Advanced implements JobLevel {
    @Override
    public BigDecimal calculateSalaryMovement(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.8"));
    }
}