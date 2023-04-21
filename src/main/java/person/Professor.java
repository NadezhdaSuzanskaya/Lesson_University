package person;
import constants.PersonConstants;

public class Professor extends Employee{
    private int professorDegree;
    private double overTimeHours;
    private byte countOfExam;


    public Professor(String name,  String individualNumber, String startDate, int numberOfWorkHours, int professorDegree, double overTimeHours, byte countOfExam) {
        super(name,  individualNumber, startDate,numberOfWorkHours);
        this.professorDegree = professorDegree;
        this.overTimeHours = overTimeHours;
        this.countOfExam = countOfExam;
    }

    public int getProfessorDegree() {
        return professorDegree;
    }

    public void setProfessorDegree(int professorDegree) {
        this.professorDegree = professorDegree;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public byte getCountOfExam() {
        return countOfExam;
    }

    public void setCountOfExam(byte countOfExam) {
        this.countOfExam = countOfExam;
    }

    @Override
    public double calcBonus(){
        return  getProfessorDegree()* PersonConstants.RATE * getOverTimeHours();

    }

    @Override
    public String toString()
    {
        return "Professor "+getName()+ " with the individual number "+getIndividualNumber()+
                " has been working since : "+getStartDate() + " and gives "+ getCountOfExam() +" exams per year";
    }

}
