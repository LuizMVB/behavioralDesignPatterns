package models;

import jobLevelSpecifications.JobLevelSpecification;
import jobLevels.JobLevel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Employee {
    private JobLevel jobLevel;
    private BigDecimal salary;
    private Date startDate;
    private JobLevelSpecification jobLevelSpecification;

    public Employee(JobLevel jobLevel, BigDecimal salary, Date startDate) {
        this.jobLevel = jobLevel;
        this.salary = salary;
        this.startDate = startDate;
    }

    public Employee(JobLevel jobLevel, BigDecimal salary, Date startDate, JobLevelSpecification jobLevelSpecification) {
        this.jobLevel = jobLevel;
        this.salary = salary;
        this.startDate = startDate;
        this.jobLevelSpecification = jobLevelSpecification;
    }

    public JobLevel getJobLevel() {
        return jobLevel;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setJobLevelSpecification(JobLevelSpecification jobLevelSpecification) {
        this.jobLevelSpecification = jobLevelSpecification;
    }

    public int getContributionTimeInYears(){
        LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(startLocalDate, LocalDate.now());
        return period.getYears();
    }

    public String obtainJobLevelSpecificationName(){
        return jobLevelSpecification.getClass().getSimpleName();
    }

    public void promoteToNextJobLevelSpecification() throws Exception {
        this.jobLevelSpecification.updateToNextJobLevelSpecification(this);
    }
}
