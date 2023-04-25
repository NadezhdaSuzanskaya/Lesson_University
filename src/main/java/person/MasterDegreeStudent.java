package person;

import enums.Departments;
import interfaces.IChangeDepartment;
import interfaces.ILeaveFeetback;

public class MasterDegreeStudent extends Student implements IChangeDepartment, ILeaveFeetback {


    private String firstDegree;
    private String termOfStudy;

    public MasterDegreeStudent() {
    }

    public MasterDegreeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, String firstDegree, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook, department);
        this.firstDegree = firstDegree;
        this.termOfStudy = termOfStudy;
    }

    public String getFirstDegree() {
        return firstDegree;
    }

    public String getTermOfStudy() {
        return termOfStudy;
    }

    public void setFirstDegree(String firstDegree) {
        this.firstDegree = firstDegree;
    }

    public void setTermOfStudy(String termOfStudy) {
        this.termOfStudy = termOfStudy;
    }

    @Override
    public String toString() {
        return "Info about Master Degree Student:" + "\n" + "name:" + getName() + "  age:" + getAge() + "  adress:" + getAddress()
                + "  phone:" + getPhone() + "  number of record book:" + getNumberOfRecordBook() + " department name is: " + department.getDepartment()
                + "  First degree:" + getFirstDegree() + "  term of study:" + getTermOfStudy() + "\n";
    }

    @Override
    public Departments changeDepartment(Departments newDepartment) {
        setDepartment(newDepartment);
        return getDepartment();
    }

    @Override
    public void leavePositiveFeetback() {
        System.out.println("Thanks for the great professorial staff\n");
    }

    @Override
    public void leaveComplain() {
        System.out.println("You should add more practice lessons");
    }
}
