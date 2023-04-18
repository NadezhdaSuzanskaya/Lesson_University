package person;

public class Assistant extends Teacher{
    private double bonuse;

    public double getBonuse() {
        return bonuse;
    }

    public void setBonuse(double bonuse) {
        this.bonuse = bonuse;
    }

    public Assistant(double min_salary, String subject, double rate, double bonuse) {
        super(min_salary, subject, rate);
        this.bonuse = bonuse;
    }
    @Override
    public void calcSalary() {
        double assistantSalary = super.getRate()*super.getMin_salary()+this.getBonuse();
        System.out.println("\n"+"Assistant's salary is: "+assistantSalary);
    }
    public void giveLabs() {

        System.out.println("Assistant gives labs every day"+"\n");
    }
}
