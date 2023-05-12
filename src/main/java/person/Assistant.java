package person;

import java.io.File;
import java.util.function.DoubleToIntFunction;
import java.util.function.IntFunction;

import constants.PersonConstants;
import enums.Departments;
import exceptions.NullValueException;
import interfaces.IAskBonus;
import interfaces.ICalcBonus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Assistant extends Employee {
    private static final Logger LOGGER = LogManager.getLogger();
    private double overTimeHours;
    private byte countOfLabs;
    protected Departments department;

    public Assistant() {
    }

    public Assistant(String name, String individualNumber, String startDate, int numberOfWorkHours, double rate, double overTimeHours, byte countOfLabs, Departments department) {
        super(name, individualNumber, startDate, numberOfWorkHours);
        this.overTimeHours = overTimeHours;
        this.countOfLabs = countOfLabs;
        this.department = department;
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

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public double checkCalculationOfBonus() {
        double bonuses;
        bonuses = PersonConstants.RATE * getOverTimeHours();
        LOGGER.info("METHOD checkCalculationOfBonus() returns a value: "+bonuses);
        return bonuses;
    }

    @Override
    public String toString() {
        return "Assistent " + getName() + " with the individual number " + getIndividualNumber() + " has been working since : "
                    + getStartDate() + " and gives " + getCountOfLabs() + " labs per day." + "His department is: " + department.getDepartment();

    }

    public int calcAssistantBonus(int numberOfWorkHours) {
        ICalcBonus<Integer, Integer> calcAssistantBonus = (x) -> (int) (x *0.33+getOverTimeHours()*0.5); //160*0.33+23*0,5=64.3
        LOGGER.info("Assistant bonus is: "+  calcAssistantBonus.calcBonus(numberOfWorkHours));
        // lambda functions from the java.util.function package
        DoubleToIntFunction roundToNearestInt = d -> (int) Math.round(d);
        int result = roundToNearestInt.applyAsInt(calcAssistantBonus.calcBonus(numberOfWorkHours));
        return  result;
    }

}
