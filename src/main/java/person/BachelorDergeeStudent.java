package person;

import enums.Departments;
import enums.Marks;
import exam.AcademicPerformance;
import interfaces.IChangeDepartment;
import interfaces.IFeedback;
import myLinkedList.MyLinkedList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BachelorDergeeStudent extends Student implements IChangeDepartment, IFeedback {
    private static final Logger LOGGER = LogManager.getLogger();
    private boolean finished;
    private String termOfStudy;
    MyLinkedList<BachelorDergeeStudent> bechelorStudents = new MyLinkedList();
    ArrayList<AcademicPerformance> exams = new ArrayList<>();

    public BachelorDergeeStudent() {
    }

    public BachelorDergeeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, boolean finished, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook, department);
        this.finished = finished;
        this.termOfStudy = termOfStudy;
        bechelorStudents.addMyLinkedList(new BachelorDergeeStudent());
    }

    public BachelorDergeeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, Departments department, boolean finished, String termOfStudy, ArrayList<AcademicPerformance> exams) {
        super(name, age, address, phone, numberOfRecordBook, department);
        this.finished = finished;
        this.termOfStudy = termOfStudy;
        this.exams = exams;
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

    public ArrayList<AcademicPerformance> getExams() {
        return exams;
    }

    public void setExams(ArrayList<AcademicPerformance> exams) {
        this.exams = exams;
    }

    @Override
    public String toString() {

        return "Info about First Degree Student: " + "\n" + "name:" + getName() + "  age:" + getAge() + "  adress:" + getAddress()
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
        return bechelorStudents.getMyLinkedList(i);

    }

    public void printBachelorDegreeStudents() {
        bechelorStudents.printMyLinkedList();

    }

    public void calcAverageMark(LinkedList<Marks> marks) {
        double average = marks.stream()
                .mapToDouble(mark -> mark.getMark())
                .average()
                .orElse(0.0);
        double averageTo2symbols = Math.round(average * 100.0) / 100.0;
        LOGGER.info("Average mark for the student is " + averageTo2symbols);
    }

    public void calcAverageMarkForAllDisciplines(ArrayList<AcademicPerformance> performances) {
        Stream<Object> average = performances.stream()
                .map(exam -> exam.getMarks()
                        .stream()
                        .mapToDouble(
                                mark -> mark.getMark())
                        .average()
                        .orElse(0.0));


        LOGGER.info("List of average marks for all disciplines for the student is " + average.collect(Collectors.toList()));
    }

    public void calcGeneralAverage(ArrayList<AcademicPerformance> performances) {
        double summaryOfMarks = performances.stream()
                .flatMap(performance -> performance.getMarks().stream())
                .mapToDouble(mark -> mark.getMark())
                .sum();

        double countOfMarks = performances.stream()
                .flatMap(performance -> performance.getMarks().stream())
                .mapToDouble(mark -> mark.getMark())
                .count();

        double generalAverage = Math.round(summaryOfMarks / countOfMarks * 100.0) / 100.0;
        ;
        LOGGER.info("GENERAL Average mark for the student is " + generalAverage);
    }

    public void filterDisciplineByName(ArrayList<AcademicPerformance> performances) {
        List<AcademicPerformance> filteredList = performances.stream()
                .filter(performance -> performance.getDiscipline().name().startsWith("P"))
                .collect(Collectors.toList());

        LOGGER.info("Filtered disciplines by name which started with 'P':");
        for (AcademicPerformance performance : filteredList) {
            LOGGER.info("- " + performance.getDiscipline());
        }
    }

    public void getListOfGoodMarks(ArrayList<AcademicPerformance> performances) {
        for (AcademicPerformance performance : performances) {
            List<Marks> filteredList = performance.getMarks().stream()
                    .filter(mark -> mark.getMark() > 4)
                    .collect(Collectors.toList());

            LOGGER.info("Filtered marks for " + performance.getDiscipline() + " with value > 4:");
            for (Marks mark : filteredList) {
                LOGGER.info("- " + mark.getMark());
            }
        }
    }

    public void getHighestMarkForEachDiscipline(ArrayList<AcademicPerformance> performances) {
        for (AcademicPerformance performance : performances) {
            OptionalDouble summaryOfMarks = performance.getMarks().stream()
                    .mapToDouble(mark -> mark.getMark())
                    .max();

            LOGGER.info("Highest value of mark is: " + summaryOfMarks.orElse(0.0) + " for discipline: " + performance.getDiscipline());
        }
    }

}



