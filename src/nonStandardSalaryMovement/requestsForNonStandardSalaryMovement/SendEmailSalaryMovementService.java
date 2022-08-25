package nonStandardSalaryMovement.requestsForNonStandardSalaryMovement;

import models.RequestForSalaryMovement;

public class SendEmailSalaryMovementService implements RequestForNonStandardSalaryMovementAction {
    @Override
    public void executeAction(RequestForSalaryMovement request) {
        System.out.println("Enviando e-mails para objeto: " + request);
    }
}
