package person;

import enums.Departments;
import interfaces.IChangeDepartment;
import interfaces.IFeedback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class MasterDegreeStudent extends Student implements IChangeDepartment, IFeedback {
    private static final Logger LOGGER = LogManager.getLogger();
    private String firstDegree;
    private String termOfStudy;
    ArrayList<MasterDegreeStudent> students = new ArrayList();
    public MasterDegreeStudent() {
    }

    public MasterDegreeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, String firstDegree, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook, department);
        this.firstDegree = firstDegree;
        this.termOfStudy = termOfStudy;
        students.add( new MasterDegreeStudent());
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
        LOGGER.info("METHOD changeDepartment() updates department to: "+newDepartment);
        return getDepartment();
    }

    @Override
    public void leavePositiveFeedback() {
        LOGGER.info("METHOD leavePositiveFeetback() - Thanks for the great professorial staff");
    }

    @Override
    public void  leaveComplain() {
        LOGGER.info("METHOD leaveComplain() - You should add more practice lessons");

    }

    public void addMasterDegreeStudent(MasterDegreeStudent obj) {
        students.add(obj);
    }

    public void printMasterDegreeStudents() {

        for (MasterDegreeStudent obj : students) {
            System.out.println(obj.toString());
        }
    }
}
