package person;

import enums.Departments;
import interfaces.IChangeDepartment;
import interfaces.IFeedback;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BachelorDergeeStudent extends Student implements IChangeDepartment, IFeedback {
    private static final Logger LOGGER = LogManager.getLogger();
    private boolean finished;
    private String termOfStudy;

    public BachelorDergeeStudent() {
    }

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

     return        "Info about First Degree Student: " + "\n" + "name:" + getName() + "  age:" + getAge() + "  adress:" + getAddress()
                    + "  phone:" + getPhone() + "  number of record book:" + getNumberOfRecordBook() + " department name is: " + department.getDepartment()
                    + "  finished:" + finished + "  term of study:" + getTermOfStudy() + "\n";
        }

    @Override
    public Departments changeDepartment(Departments newDepartment) {
        setDepartment(newDepartment);
        LOGGER.info("METHOD changeDepartment() updates department to: "+newDepartment);
        return getDepartment();
    }

    @Override
    public void leavePositiveFeedback() {
        LOGGER.info("METHOD leavePositiveFeetback() - Thanks for the useful lesson!");
    }

    @Override
    public void leaveComplain() {
        LOGGER.info("METHOD leaveComplain() - This lesson was awful!");
    }
}