package person;

import constants.PersonConstants;

public abstract class Employee extends Person {

    protected String individualNumber;
    protected String startDate;
    protected int numberOfWorkHours;

    public Employee( String name, String individualNumber, String startDate, int numberOfWorkHours) {
        super(name);
        this.individualNumber = individualNumber;
        this.startDate=startDate;
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

    public final double minSalary()
    {
        return PersonConstants.RATE *getNumberOfWorkHours();
    };

    public abstract double calcBonus();

    public final double calcSalary()
    {
       return minSalary()+calcBonus();
    };


}
