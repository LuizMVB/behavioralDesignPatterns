package nonStandardSalaryMovement;

import models.Employee;

public class RequestForNonStandardSalaryMovement {
    private String managerName;
    private Employee employee;
    private boolean isAskedByHimself;
    private String description;

    public RequestForNonStandardSalaryMovement(String managerName, Employee employee, boolean isAskedByHimself, String description) {
        this.managerName = managerName;
        this.employee = employee;
        this.isAskedByHimself = isAskedByHimself;
        this.description = description;
    }

    public String getManagerName() {
        return managerName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDescription() {
        return description;
    }
}
