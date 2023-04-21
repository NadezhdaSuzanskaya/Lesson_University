package person;

import constants.PersonConstants;

public class Assistant extends Employee{
    private double overTimeHours;
    private byte countOfLabs;

    public Assistant(String name, String individualNumber, String startDate, int numberOfWorkHours,  double rate, double overTimeHours, byte countOfLabs) {
        super(name, individualNumber, startDate,numberOfWorkHours);
        this.overTimeHours = overTimeHours;
        this.countOfLabs= countOfLabs;
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
    public double calcBonus(){
        return   PersonConstants.RATE *getOverTimeHours();

    }

    @Override
    public String toString()
    {
        return "Assistent "+getName()+ " with the individual number "+getIndividualNumber()+" has been working since : "
                +getStartDate() + " and gives "+  getCountOfLabs()+" labs per day";
    }
}
