package person;

public class Teacher extends Employee{
    private String subject;
    private double rate;

    public Teacher(double min_salary, String subject, double rate) {
        super(min_salary);
        this.subject = subject;
        this.rate = rate;
    }


    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public void calcSalary() {
    double teatcherSalary = this.getRate()*super.getMin_salary();
    System.out.println("Teacher salary: "+teatcherSalary);
    }
}
