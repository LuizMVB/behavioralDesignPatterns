package nonStandardSalaryMovement.requestsForNonStandardSalaryMovement;

import models.RequestForSalaryMovement;

public class SendEmailSalaryMovementService implements RequestForNonStandardSalaryMovementAction {
    @Override
    public void executeAction(RequestForSalaryMovement request) {
        System.out.println("Sending e-mails for object: " + request);
    }
}
