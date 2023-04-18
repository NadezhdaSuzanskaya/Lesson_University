package person;

public class Professor extends Teacher{
    private double bonuse;
    private byte countOfExam;

    public double getBonuse() {
        return bonuse;
    }

    public void setBonuse(double bonuse) {
        this.bonuse = bonuse;
    }

    public byte getCountOfExam() {
        return countOfExam;
    }

    public void setCountOfExam(byte countOfExam) {
        this.countOfExam = countOfExam;
    }

    public Professor( double min_salary, String subject, double rate, double bonuse, byte countOfExam) {
        super( min_salary,  subject,  rate);
        this.bonuse=bonuse;
        this.countOfExam = countOfExam;
    }

    @Override
    public void calcSalary() {
        double professorSalary = super.getRate()*super.getMin_salary()+this.getBonuse();
        System.out.println("Professor's salary is: "+professorSalary);
    }
    public void giveLecture() {

        System.out.println("Professor gives lecture 3 times per week ");
    }

    public void giveExam(byte countOfExam) {

        System.out.println("Professor gives "+ countOfExam +" exams per year");
    }
}
