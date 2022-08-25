package tests;

import nonStandardSalaryMovement.RequestForNonStandardSalaryMovement;
import nonStandardSalaryMovement.RequestForNonStandardSalaryMovementHandler;
import nonStandardSalaryMovement.requestsForNonStandardSalaryMovement.SaveRequest;
import nonStandardSalaryMovement.requestsForNonStandardSalaryMovement.SendEmailSalaryMovementService;

import java.util.Arrays;

public class RequestForNonStandardSalaryMovementTest {
    public static void main(String[] args){
        RequestForNonStandardSalaryMovement requestForNonStandardSalaryMovement = new RequestForNonStandardSalaryMovement(
                "Fulano",
                GenerateData.obtainTestEmployee(),
                true,
                "Testando"
        );
        RequestForNonStandardSalaryMovementHandler handler = new RequestForNonStandardSalaryMovementHandler(
                Arrays.asList(
                        new SaveRequest(),
                        new SendEmailSalaryMovementService()
                )
        );
        handler.execute(requestForNonStandardSalaryMovement);
    }
}
