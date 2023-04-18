package person;

public class OtherStaff extends Employee{
    private String role;
    public OtherStaff(double min_salary, String role) {
        super(min_salary);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void calcSalary() {
       System.out.println("For other staff the salary is: "+ super.getMin_salary());
    }

    public void getStaffRole(String role) {
        System.out.println("The staff role is : "+ role +"\n");
    }
}
