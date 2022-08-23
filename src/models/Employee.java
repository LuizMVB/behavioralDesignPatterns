package models;

import sporadicSalaryMovementJobLevels.JobLevel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Employee {
    private JobLevel jobLevel;
    private BigDecimal salary;
    private Date startDate;

    public Employee(JobLevel jobLevel, BigDecimal salary, Date startDate) {
        this.jobLevel = jobLevel;
        this.salary = salary;
        this.startDate = startDate;
    }

    public JobLevel getJobLevel() {
        return jobLevel;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public int getContributionTimeInYears(){
        LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period period = Period.between(startLocalDate, LocalDate.now());
        return period.getYears();
    }
}
