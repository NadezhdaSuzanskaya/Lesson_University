package person;

import constants.PersonConstants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdministrativeStaff extends Employee {
    private static final Logger LOGGER = LogManager.getLogger();
    private String role;
    private double premium;

    public AdministrativeStaff() {
    }

    public AdministrativeStaff(String name, String individualNumber, String startDate, int numberOfWorkHours, String role, double premium) {
        super(name, individualNumber, startDate, numberOfWorkHours);
        this.role = role;
        this.premium = premium;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    @Override
    public double checkCalculationOfBonus() {
        double bonuses;
        bonuses = PersonConstants.RATE + getPremium();
        LOGGER.info("METHOD checkCalculationOfBonus() returns a value: "+bonuses);
        return bonuses;

    }

    @Override
    public String toString() {
        LOGGER.info("METHOD toString() returns:  'The staff role is :' " + getRole());
        return "The staff role is : " + getRole() + "\n";
    }
}
