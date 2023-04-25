package person;

import constants.PersonConstants;
import enums.Departments;
import interfaces.IAskBonus;
import interfaces.IChangeDepartment;

public class Professor extends Employee implements IAskBonus, IChangeDepartment {
    private int professorDegree;
    private double overTimeHours;
    private byte countOfExam;
    protected Departments department;
    public static int count = 0;

    public Professor() {
    }

    public Professor(String name, String individualNumber, String startDate, int numberOfWorkHours, int professorDegree, double overTimeHours, byte countOfExam, Departments department) {
        super(name, individualNumber, startDate, numberOfWorkHours);
        this.professorDegree = professorDegree;
        this.overTimeHours = overTimeHours;
        this.countOfExam = countOfExam;
        this.department = department;
        count++;
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

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public double checkCalculationOfBonus() {
        return getProfessorDegree() * PersonConstants.RATE * getOverTimeHours();

    }

    @Override
    public String toString() {
        return "Professor " + getName() + " with the individual number " + getIndividualNumber() +
                " has been working since : " + getStartDate() + " and gives " + getCountOfExam() + " exams per year." + "His department is: " + department.getDepartment();
    }

    @Override
    public void askPersonalBonus() {
        System.out.println("Can I have monthly bonus because I have " + getOverTimeHours() + " overtimes Hours?");
    }

    @Override
    public String askBonusForCollege() {
        return "I recommend this person" + getName() + " to receive a bonus for the last month";
    }

    @Override
    public Departments changeDepartment(Departments newDepartment) {
        setDepartment(newDepartment);
        return getDepartment();
    }


}
