package person;

public abstract class Employee extends Person {

    private double min_salary;

    public double getMin_salary() {
        return min_salary;
    }

    public void setMin_salary(double min_salary) {
        this.min_salary = min_salary;
    }

    public Employee( double min_salary) {
        super();
        this.min_salary=min_salary;
    }


    public abstract void calcSalary();
}
