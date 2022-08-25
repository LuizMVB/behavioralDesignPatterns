package nonStandardSalaryMovement;

import models.RequestForSalaryMovement;
import nonStandardSalaryMovement.requestsForNonStandardSalaryMovement.RequestForNonStandardSalaryMovementAction;

import java.util.Date;
import java.util.List;

public class RequestForNonStandardSalaryMovementHandler {

    private List<RequestForNonStandardSalaryMovementAction> actions;

    public RequestForNonStandardSalaryMovementHandler(List<RequestForNonStandardSalaryMovementAction> actions) {
        this.actions = actions;
    }

    public void execute(RequestForNonStandardSalaryMovement requestForNonStandardSalaryMovement){
        RequestForSalaryMovement requestForSalaryMovement = new RequestForSalaryMovement(
                requestForNonStandardSalaryMovement.getDescription(),
                new Date(),
                requestForNonStandardSalaryMovement.getManagerName(),
                requestForNonStandardSalaryMovement.getEmployee()
        );

        for(RequestForNonStandardSalaryMovementAction action: actions){
            action.executeAction(requestForSalaryMovement);
        }
    }

}
