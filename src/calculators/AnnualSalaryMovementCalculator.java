package calculators;

import annualSalaryMovement.AnnualSalaryMovement;
import annualSalaryMovement.MakeAnnualSalaryMovementByContributionTime;
import annualSalaryMovement.MakeAnnualSalaryMovementByJobLevel;
import annualSalaryMovement.MakeAnnualSalaryMovementBySalaryAmount;
import annualSalaryMovement.WithoutAnnualSalaryMovement;
import models.Employee;

import java.math.BigDecimal;

public class AnnualSalaryMovementCalculator {
    public static BigDecimal calculateFor(Employee employee){
        AnnualSalaryMovement annualSalaryMovement = new MakeAnnualSalaryMovementBySalaryAmount(
                new MakeAnnualSalaryMovementByJobLevel(
                        new MakeAnnualSalaryMovementByContributionTime(
                                new WithoutAnnualSalaryMovement()
                        )
                )
        );

        return annualSalaryMovement.calculateSalaryMovementFor(employee);
    }
}
