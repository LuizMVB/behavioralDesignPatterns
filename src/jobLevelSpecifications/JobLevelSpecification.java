package jobLevelSpecifications;

import models.Employee;

public abstract class JobLevelSpecification {

    public void updateToNextJobLevelSpecification(Employee employee) throws Exception {
        throw new Exception("Can't update to the next level");
    }
}
