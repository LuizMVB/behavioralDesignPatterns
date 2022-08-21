package calculators;

import models.jobTypes.JobType;

import java.math.BigDecimal;

public class SalaryMovementCalculator {

    /**
     * Calculates salary movement given a specific type of job
     * @param salary The salary
     * @param jobType The type of job
     * @return The movement that must be applied
     */
    public static BigDecimal calculate(BigDecimal salary, JobType jobType){
        return jobType.calculateSalaryMovement(salary);
    }
}
