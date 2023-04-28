package person;

import constants.CalcSalary;
import constants.PersonConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Employee extends Person {
    private static final Logger LOGGER = LogManager.getLogger();
    protected String individualNumber;
    protected String startDate;
    protected int numberOfWorkHours;

    public Employee() {
    }

    public Employee(String name, String individualNumber, String startDate, int numberOfWorkHours) {
        super(name);
        this.individualNumber = individualNumber;
        this.startDate = startDate;
        this.numberOfWorkHours = numberOfWorkHours;
    }

    public String getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(String individualNumber) {
        this.individualNumber = individualNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumberOfWorkHours() {
        return numberOfWorkHours;
    }

    public void setNumberOfWorkHours(int numberOfWorkHours) {
        this.numberOfWorkHours = numberOfWorkHours;
    }

    public final double checkCalculationOfMinSalary() {
        double minSalary;
        minSalary = PersonConstants.RATE * getNumberOfWorkHours();
        LOGGER.info("METHOD checkCalculationOfMinSalary() returns min salaty" + minSalary);
        return minSalary;
    }

    ;

    public abstract double checkCalculationOfBonus();

    public final double checkCalculationOfSalary() {
        double salary;
        salary = checkCalculationOfMinSalary() + checkCalculationOfBonus();
        LOGGER.info("METHOD checkCalculationOfSalary() returns: " + salary);
        return salary;
    }

    ;


}
