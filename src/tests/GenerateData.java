package tests;

import jobLevelSpecifications.Gold;
import jobLevels.Advanced;
import models.Employee;

import java.math.BigDecimal;
import java.util.Date;

public class GenerateData {
    public static Employee obtainTestEmployee(){
        return new Employee(
                new Advanced(),
                new BigDecimal("10000"),
                new Date(),
                new Gold()
        );
    }
}
