package person;

import constants.PersonConstants;

public class AdministrativeStaff extends Employee{
    private String role;
    private double premium;

    public AdministrativeStaff() {};

    public AdministrativeStaff(String name,  String individualNumber, String startDate,int numberOfWorkHours, String role,double premium) {
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
    public double calcBonus(){
        return   PersonConstants.RATE +getPremium();

    }

    @Override
    public String toString() {
        return "The staff role is : "+ getRole() +"\n";
    }
}
