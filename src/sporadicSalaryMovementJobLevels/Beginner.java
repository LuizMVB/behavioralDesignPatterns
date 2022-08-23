package sporadicSalaryMovementJobLevels;

import java.math.BigDecimal;

public class Beginner implements JobLevel {
    @Override
    public BigDecimal calculateSalaryMovement(BigDecimal salary) {
        return salary.multiply(new BigDecimal("0.2"));
    }
}
