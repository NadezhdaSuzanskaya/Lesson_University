import discipline.EcomonicDiscipline;
import discipline.InformationSecurityDiscipline;
import enums.Departments;
import enums.NumberOfClassRoom;
import enums.Semesters;
import enums.TypeOfClassRoom;
import exceptions.LongValueException;
import exceptions.NullValueException;
import exceptions.SpecificSymbolException;
import lesson.LectureLesson;
import lesson.PracticeLesson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.*;

import java.util.ArrayList;
import java.util.function.Consumer;

public class University {
    public static void main(String[] args) throws NullValueException, LongValueException, SpecificSymbolException {
        Logger LOGGER = LogManager.getLogger();
        byte countOfLecture1 = 0;
         double overageSalary = 1000;
        //add Collection of MasterDegree Students,  calculate their count and call methods leaveComplain(), leavePositiveFeedback()
        MasterDegreeStudent arrayOfMasterDegreeStudent = new MasterDegreeStudent();
        MasterDegreeStudent masterDegreeStudent1 = new MasterDegreeStudent("Bob", (byte) 22, "Oslo, 5312, Black 11", "+22-11-5435", "123-00-766", Departments.INFORMATION_SECURITY, "bachelor", "2022-2025");
        MasterDegreeStudent masterDegreeStudent2 = new MasterDegreeStudent("Fred", (byte) 21, "Berlin, Unter den Linden Strasse, 3-11", "+40 462 86 45", "001-02-032", Departments.MARKETING, "bachelor", "2021-2024");
        MasterDegreeStudent masterDegreeStudent3 = new MasterDegreeStudent("Brus", (byte) 25, "Leon, Gross 2-34", "+22 111 16 25", "012-232-332", Departments.ECONOMIC, "bachelor", "2021-2024");
        
        arrayOfMasterDegreeStudent.addMasterDegreeStudent(masterDegreeStudent1);
        arrayOfMasterDegreeStudent.addMasterDegreeStudent(masterDegreeStudent2);
        arrayOfMasterDegreeStudent.addMasterDegreeStudent(masterDegreeStudent3);
        arrayOfMasterDegreeStudent.printMasterDegreeStudents();

        masterDegreeStudent1.leaveComplain();
        masterDegreeStudent2.leavePositiveFeedback();

        //add Collection of BachelorDergee Students,   change for all of them Department value and call methods leaveComplain(), leavePositiveFeedback()
        BachelorDergeeStudent bachelorDergeeStudents = new BachelorDergeeStudent();
        BachelorDergeeStudent firstDegreeStudent1 = new BachelorDergeeStudent("Monika", (byte) 23, "Warsaw", "+48-30-23-987", "01-032", Departments.INFORMATION_TECHNOLOGIES, true, "2020-2024");
        BachelorDergeeStudent firstDegreeStudent2 = new BachelorDergeeStudent("Beata", (byte) 25, "Warsaw", "+48-44-00-111", "01-132", Departments.ECONOMIC, false, "2023-2027");
        BachelorDergeeStudent firstDegreeStudent3 = new BachelorDergeeStudent("Anna", (byte) 26, "Warsaw", "+48-45-56-456", "01-321", Departments.MARKETING, true, "2022-2026");
        bachelorDergeeStudents.addBachelorDegreeStudent(firstDegreeStudent1);
        bachelorDergeeStudents.addBachelorDegreeStudent(firstDegreeStudent2);
        bachelorDergeeStudents.addBachelorDegreeStudent(firstDegreeStudent3);
        bachelorDergeeStudents.printBachelorDegreeStudents();

        bachelorDergeeStudents.getBachelorDegreeStudent(1).changeDepartment(Departments.INFORMATION_SECURITY);

        firstDegreeStudent1.leaveComplain();
        firstDegreeStudent2.leavePositiveFeedback();

        //add Collection of Professors
        ArrayList<Professor> professors = new ArrayList();

        Professor professor1 = null;
        //professor1.checkNumberOfProfessors();
        professor1 = new Professor("Doris", "12-12-08", "12-01-2019", 160, 2, 250, (byte) 3, Departments.COMPUTER_SCIENCE);
        Professor professor2 = new Professor("Kelly", "21-10-99", "22-11-2022", 161, 2, 100, (byte) 6, Departments.INFORMATION_TECHNOLOGIES);
        professors.add(professor1);
        professors.add(professor2);
        professors.get(0).checkCalculationOfSalary();
        professors.get(1).askPersonalBonus();
        professors.get(1).askBonusForCollege("Doris");
        double  professorBonus= professors.get(0).calcProfessorBonus(professors.get(1).getProfessorDegree());
        double  professorMinSalary = professors.get(0).calcProfessorMinSalary();
        double  professorSalary = professors.get(0).calcProfessorSalary(professorBonus, professorMinSalary);
        professors.get(0).compareSalaryWithOverage(professorSalary, overageSalary);


        //check NullValueException
        //professors.get(1).askBonusForCollege("");

        //check LongValueException
        //professors.get(0).askBonusForCollege(" Test test test test test test test tets ");

        //check SpecificSymbolException
        //professors.get(0).askBonusForCollege("Doris+");


        // lambda functions from the java.util.function package
        Consumer<String> printString = (str) -> System.out.println(str);
        LOGGER.info("---------------------------------");
        printString.accept(professors.get(0).toString());
        professors.get(0).changeDepartment(Departments.MARKETING);
        printString.accept(professors.get(0).toString());
        LOGGER.info("---------------------------------");
        professor1.checkNumberOfProfessors();

        //add Collection of Assistant
         ArrayList<Assistant> assistants = new ArrayList();
        Assistant assistant1 = new Assistant("Monika", "18-22-34", "11-03-2000", 152, 1, 50, (byte) 5, Departments.MARKETING);
        Assistant assistant2 = new Assistant("Rebecca", "24-52-56", "27-06-2011", 160, 2, 23, (byte) 5, Departments.ECONOMIC);
        Assistant assistant3 = new Assistant("Nika", "18-24-46", "21-07-2002", 168, 3, 10, (byte) 5, Departments.INFORMATION_TECHNOLOGIES);
        Assistant assistant4 = new Assistant("Maya", "10-09-50", "12-12-2001", 172, 2, 0, (byte) 5, Departments.COMPUTER_SCIENCE);
        assistants.add(assistant1);
        assistants.add(assistant2);
        assistants.add(assistant3);
        assistants.add(assistant4);
        assistants.get(1).calcAssistantBonus(assistants.get(1).getNumberOfWorkHours());
        int assistant_count = 0;
        while (assistant_count < assistants.size()) {
            assistants.get(assistant_count).checkCalculationOfSalary();
            assistant_count++;
        }

        //add Collection of AdministrativeStaff
        ArrayList<AdministrativeStaff> administrativeStaffs = new ArrayList<>();
        AdministrativeStaff admStaff = new AdministrativeStaff("David ", "01-01-99", "01-01-1999", 168, "laboratory assistant", 400.99);
        administrativeStaffs.add(admStaff);
        administrativeStaffs.get(0).checkCalculationOfSalary();

        //add Collection of LectureLesson
        ArrayList<LectureLesson> lectureLessons = new ArrayList<>();
        LectureLesson lectureLesson = new LectureLesson(90, TypeOfClassRoom.LectureClassRoom, NumberOfClassRoom.CLASSROOM_210, professors.get(0), (byte) 32);
        LectureLesson lectureLesson1 = new LectureLesson(90, TypeOfClassRoom.LectureClassRoom, NumberOfClassRoom.CLASSROOM_311, professors.get(0), countOfLecture1);
        lectureLessons.add(lectureLesson);
        LOGGER.info(lectureLessons.get(0));
        //check NegativeValueException and LargeNumberException
        lectureLesson.checkNumberOfLecture();
        lectureLessons.get(0).changeCountOfLesson((byte) 10);
        lectureLessons.get(0).changeClassRoom(TypeOfClassRoom.LectureClassRoom, NumberOfClassRoom.CLASSROOM_101);
        LOGGER.info(lectureLessons.get(0));
        //add Collection of PracticeLesson
        ArrayList<PracticeLesson> practiceLessons = new ArrayList<>();
        PracticeLesson practiceLesson = new PracticeLesson(45, TypeOfClassRoom.LaboratoryClassRoom, NumberOfClassRoom.CLASSROOM_100A, assistants.get(1), (byte) 30);
        //  System.out.println(practiceLesson);
        practiceLessons.add(practiceLesson);
        practiceLessons.get(0).changeCountOfLesson((byte) 42);
        // System.out.println("New info with changing count of practice lesson:\n" + practiceLesson);


        //add Collection of EcomonicDiscipline
        ArrayList<EcomonicDiscipline> ecomonicDisciplines = new ArrayList<>();
        EcomonicDiscipline ecomonicDiscipline1 = new EcomonicDiscipline("Ecomonic",
                Semesters.FIFTH_SEMESTER, lectureLesson, practiceLesson, 303);
        EcomonicDiscipline ecomonicDiscipline2 = new EcomonicDiscipline("Ecomonic",
                Semesters.FIFTH_SEMESTER, lectureLesson, practiceLesson, 303);

        ecomonicDisciplines.add(ecomonicDiscipline1);
        ecomonicDisciplines.add(ecomonicDiscipline2);
        if (ecomonicDisciplines.get(0).equals(ecomonicDisciplines.get(1))) {
            LOGGER.info("The group " + ecomonicDisciplines.get(0).getGroup() + " has already " + ecomonicDisciplines.get(1).getDisciplineName() + " in the schedule");
        } else {
            LOGGER.info("The group " + ecomonicDisciplines.get(0).getGroup() + " hasn't  " + ecomonicDisciplines.get(1).getDisciplineName() + " in the schedule");
        }

        //add Collection of InformationSecurityDiscipline
        ArrayList<InformationSecurityDiscipline> informationSecurityDisciplines = new ArrayList<>();
        InformationSecurityDiscipline informationSecurity1 = new InformationSecurityDiscipline(
                "Information security online", Semesters.FIRST_SEMESTER, lectureLesson, practiceLesson, 101);
        InformationSecurityDiscipline informationSecurity2 = new InformationSecurityDiscipline(
                "Information security online", Semesters.SECOND_SEMESTER, lectureLesson, practiceLesson, 101);
        informationSecurityDisciplines.add(informationSecurity1);
        informationSecurityDisciplines.add(informationSecurity2);
        if (informationSecurity1.equals(informationSecurity2)) {
            LOGGER.info("The group " + informationSecurity1.getGroup() + " has already " + informationSecurity2.getDisciplineName() + " in the schedule");
        } else {
            LOGGER.info("The group " + informationSecurity1.getGroup() + " hasn't  " + informationSecurity2.getDisciplineName() + " in the schedule");
        }

    }
}
