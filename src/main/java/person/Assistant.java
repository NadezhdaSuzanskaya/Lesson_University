package person;

import constants.PersonConstants;
import enums.Departments;
import interfaces.IAskBonus;

public class Assistant extends Employee  {
    private double overTimeHours;
    private byte countOfLabs;
    protected Departments department;

    public Assistant() {
    }

    public Assistant(String name, String individualNumber, String startDate, int numberOfWorkHours, double rate, double overTimeHours, byte countOfLabs, Departments department) {
        super(name, individualNumber, startDate,numberOfWorkHours);
        this.overTimeHours = overTimeHours;
        this.countOfLabs= countOfLabs;
        this.department= department;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public byte getCountOfLabs() {
        return countOfLabs;
    }

    public void setCountOfLabs(byte countOfLabs) {
        this.countOfLabs = countOfLabs;
    }

    @Override
    public double checkCalculationOfBonus(){
        return   PersonConstants.RATE *getOverTimeHours();

    }

    @Override
    public String toString()
    {
        return "Assistent "+getName()+ " with the individual number "+getIndividualNumber()+" has been working since : "
                +getStartDate() + " and gives "+  getCountOfLabs()+" labs per day." + "His department is: " + department.getDepartment();
    }


}
