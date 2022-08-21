package models;

import models.jobTypes.JobType;

import java.math.BigDecimal;

public class Employee {
    private JobType jobType;
    private BigDecimal salary;

    public Employee(JobType jobType, BigDecimal salary) {
        this.jobType = jobType;
        this.salary = salary;
    }

    public JobType getJobType() {
        return jobType;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
