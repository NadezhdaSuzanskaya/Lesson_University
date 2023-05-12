package person;

import enums.Departments;
import interfaces.IChangeDepartment;
import interfaces.IFeedback;
import myLinkedList.MyLinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Consumer;

public class BachelorDergeeStudent extends Student implements IChangeDepartment, IFeedback {
    private static final Logger LOGGER = LogManager.getLogger();
    private boolean finished;
    private String termOfStudy;
    MyLinkedList <BachelorDergeeStudent> bechelorStudents = new MyLinkedList();

    public BachelorDergeeStudent() {
    }

    public BachelorDergeeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, boolean finished, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook, department);
        this.finished = finished;
        this.termOfStudy = termOfStudy;
        bechelorStudents.addMyLinkedList(new BachelorDergeeStudent());
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
            LOGGER.info("METHOD changeDepartment() updates department to: " + newDepartment);
            return getDepartment();

    }

    @Override
    public void leavePositiveFeedback() {
        LOGGER.info("METHOD leavePositiveFeetback() - Thanks for the useful lesson!");
    }

    @Override
    public void leaveComplain() {
        String text_message = "This lesson was awful!";
        LOGGER.info("METHOD leaveComplain() - This lesson was awful!");
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept(text_message);
    }
    public void addBachelorDegreeStudent(BachelorDergeeStudent obj) {
        bechelorStudents.addMyLinkedList(obj);

    }
    public BachelorDergeeStudent getBachelorDegreeStudent(int i) {
        return     bechelorStudents.getMyLinkedList(i);

    }

    public void printBachelorDegreeStudents() {
            bechelorStudents.printMyLinkedList();

    }
}