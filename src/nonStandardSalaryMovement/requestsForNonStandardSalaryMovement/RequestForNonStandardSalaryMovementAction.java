package nonStandardSalaryMovement.requestsForNonStandardSalaryMovement;

import models.RequestForSalaryMovement;

public interface RequestForNonStandardSalaryMovementAction {
    void executeAction(RequestForSalaryMovement request);
}
