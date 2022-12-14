package calculators;

import jobLevels.JobLevel;

import java.math.BigDecimal;

public class SporadicSalaryMovementCalculator {

    /**
     * Calculates salary movement given a specific level of job
     * @param salary The salary
     * @param jobLevel The type of job
     * @return The movement that must be applied
     */
    public static BigDecimal calculate(BigDecimal salary, JobLevel jobLevel){
        return jobLevel.calculateSalaryMovement(salary);
    }
}
