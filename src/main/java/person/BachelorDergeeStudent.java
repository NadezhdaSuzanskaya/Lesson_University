package person;

import enums.Departments;
import interfaces.IChangeDepartment;
import interfaces.ILeaveFeetback;

public class BachelorDergeeStudent extends Student implements IChangeDepartment, ILeaveFeetback {

    private boolean finished;
    private String termOfStudy;

    public BachelorDergeeStudent(){}

    public BachelorDergeeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, boolean finished, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook, department);
        this.finished = finished;
        this.termOfStudy = termOfStudy;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getTermOfStudy() {
        return termOfStudy;
    }

    public void setTermOfStudy(String termOfStudy) {
        this.termOfStudy = termOfStudy;
    }



    @Override
    public String toString() {
        return "Info about First Degree Student: "+"\n"+ "name:"+getName() +"  age:"+getAge()+"  adress:"+getAddress()
                +"  phone:"+getPhone()+"  number of record book:"+getNumberOfRecordBook() +" department name is: "+department.getDepartment()
                + "  finished:"+finished+ "  term of study:"+getTermOfStudy()+"\n";
    }

    @Override
    public Departments changeDepartment(Departments newDepartment) {
        setDepartment(newDepartment);
        return getDepartment();
    }

    @Override
    public void leavePositiveFeetback() {
        System.out.println("Thanks for the useful lesson!\n");
    }

    @Override
    public void leaveComplain() {
        System.out.println("This lesson was awful!");
    }
}