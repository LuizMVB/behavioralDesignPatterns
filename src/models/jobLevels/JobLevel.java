package models.jobLevels;

import java.math.BigDecimal;

public interface JobLevel {
    /**
     * Calculates salary movement of a given salary
     * @param salary The given salary
     * @return The movement that must be applied
     */
    BigDecimal calculateSalaryMovement(BigDecimal salary);
}
