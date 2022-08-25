package nonStandardSalaryMovement.requestsForNonStandardSalaryMovement;

import models.RequestForSalaryMovement;

public class SaveRequest implements RequestForNonStandardSalaryMovementAction{
    @Override
    public void executeAction(RequestForSalaryMovement request) {
        System.out.println("Saving requests for object: " + request);
    }
}
