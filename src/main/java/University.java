import constants.CalcSalary;
import discipline.EcomonicDiscipline;
import discipline.InformationSecurityDiscipline;
import enums.Departments;
import enums.Semesters;
import exceptions.*;
import lesson.LectureLesson;
import lesson.PracticeLesson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.*;

public class University {
    public static void main(String[] args) throws NullValueException, LongValueException, SpecificSymbolException {
        Logger LOGGER = LogManager.getLogger();
        String student_name = "Mike";
        byte student_age = 22;
        String student_address = "Warszawa, 03-567, Zytnia 18";
        String student_phone = "+48-13-16-789";
        String student_numberOfRecordBook = "123-00-764";

        String master_name = "Bob";
        String empty_master_name = "";
        byte master_age = 25;
        String master_address = "Oslo, 5312, Black 11";
        String master_phone = "+22-11-5435";
        String master_numberOfRecordBook = "123-00-766";
        String master_firstDegree = "bachelor";
        String master_termOfStudy = "2022-2025";

        boolean finished = false;

        byte countOfLecture1 = 0;

        MasterDegreeStudent masterDegreeStudent = new MasterDegreeStudent(master_name, master_age, master_address, master_phone, master_numberOfRecordBook, Departments.INFORMATION_SECURITY, master_firstDegree, master_termOfStudy);
        MasterDegreeStudent masterDegreeStudentWithEmptyName = new MasterDegreeStudent(empty_master_name, master_age, master_address, master_phone, master_numberOfRecordBook, Departments.INFORMATION_SECURITY, master_firstDegree, master_termOfStudy);

        masterDegreeStudentWithEmptyName.leaveComplain();
        masterDegreeStudent.leavePositiveFeedback();

        BachelorDergeeStudent firstDegreeStudent = new BachelorDergeeStudent(student_name, student_age, student_address, student_phone, student_numberOfRecordBook, Departments.ECONOMIC, finished, master_termOfStudy);
       // System.out.println(firstDegreeStudent);
        firstDegreeStudent.changeDepartment(Departments.INFORMATION_SECURITY);
    //    System.out.println("New info with changing department:\n" + firstDegreeStudent);
        firstDegreeStudent.leaveComplain();
        firstDegreeStudent.leavePositiveFeedback();
        try {
            if (Professor.count <=0 ) {

                throw new NegativeValueException();
            }
        } catch (NegativeValueException exp) {
            LOGGER.error(exp.getMessage());
        }

        Professor professor = new Professor("Doris", "12-12-08", "12-01-2019", 160, 2, 250, (byte) 3, Departments.COMPUTER_SCIENCE);
        Professor professor2 = new Professor("Kelly", "21-10-99", "22-11-2022", 161, 2, 100, (byte) 6, Departments.INFORMATION_TECHNOLOGIES);
        professor.checkCalculationOfSalary();
        //System.out.println(professor);
        professor.askPersonalBonus();
        //  professor.askBonusForCollege("Doris");
        //check NullValueException
        //professor.askBonusForCollege("");

        //check LongValueException
        //professor.askBonusForCollege(" Test test test test test test test tets ");

        //check SpecificSymbolException
        //professor.askBonusForCollege("Doris+");

        professor.changeDepartment(Departments.COMPUTER_SCIENCE);
     //   System.out.println("New info with changing department:\n" + professor);
        try {
            if (Professor.count < 0 && Professor.count < 100) {
                throw new NegativeValueException();
            } else  if (Professor.count < 0 && Professor.count < 100){
                throw new LargeNumberException();
            }
        } catch (NegativeValueException exp) {
            LOGGER.error(exp.getMessage());
        } catch (LargeNumberException exp) {
            LOGGER.error(exp.getMessage());
        }

        CalcSalary calcSalary = new CalcSalary();
        calcSalary.calcMinSalary(professor.getNumberOfWorkHours());

        Assistant assistant = new Assistant("Monika", "18-88-00", "21-02-2000", 172, 2, 200, (byte) 5, Departments.MARKETING);
        assistant.checkCalculationOfSalary();
        //System.out.println(assistant);

        AdministrativeStaff admStaff = new AdministrativeStaff("David ", "01-01-99", "01-01-1999", 168, "laboratory assistant", 400.99);
        admStaff.checkCalculationOfSalary();
        //System.out.println(admStaff);

        LectureLesson lectureLesson = new LectureLesson(90, "202B", professor, (byte) 32);
        //System.out.println(lectureLesson);

        //check NegativeValueException and LargeNumberException
        try {
            if (countOfLecture1 > 0 && countOfLecture1 < 100) {
                LectureLesson lectureLesson1 = new LectureLesson(90, "202B", professor, countOfLecture1);
            } else if (countOfLecture1 <= 0) {
                throw new NegativeValueException();
            } else  {
                throw new LargeNumberException();
            }
        } catch (NegativeValueException exp) {
            LOGGER.error(exp.getMessage());
        } catch (LargeNumberException exp) {
            LOGGER.error(exp.getMessage());
        }

        lectureLesson.changeCountOfLesson((byte) 10);
        lectureLesson.changeClassRoom("111");


        PracticeLesson practiceLesson = new PracticeLesson(45, "101A", assistant, (byte) 30);
      //  System.out.println(practiceLesson);
        practiceLesson.changeCountOfLesson((byte) 42);
       // System.out.println("New info with changing count of practice lesson:\n" + practiceLesson);

        EcomonicDiscipline ecomonicDiscipline1 = new EcomonicDiscipline("Ecomonic",
                Semesters.FIFTH_SEMESTER, lectureLesson, practiceLesson, 303);
        EcomonicDiscipline ecomonicDiscipline2 = new EcomonicDiscipline("Ecomonic",
                Semesters.FIFTH_SEMESTER, lectureLesson, practiceLesson, 303);

        if (ecomonicDiscipline1.equals(ecomonicDiscipline2)) {
            LOGGER.info("The group " + ecomonicDiscipline1.getGroup() + " has already " + ecomonicDiscipline2.getDisciplineName() + " in the schedule");
        } else {
            LOGGER.info("The group " + ecomonicDiscipline1.getGroup() + " hasn't  " + ecomonicDiscipline2.getDisciplineName() + " in the schedule");
        }
        ;

        InformationSecurityDiscipline informationSecurity1 = new InformationSecurityDiscipline(
                "Information security online", Semesters.FIRST_SEMESTER, lectureLesson, practiceLesson, 101);
        InformationSecurityDiscipline informationSecurity2 = new InformationSecurityDiscipline(
                "Information security online", Semesters.SECOND_SEMESTER, lectureLesson, practiceLesson, 101);

        if (informationSecurity1.equals(informationSecurity2)) {
            LOGGER.info("The group " + informationSecurity1.getGroup() + " has already " + informationSecurity2.getDisciplineName() + " in the schedule");
        } else {
            LOGGER.info("The group " + informationSecurity1.getGroup() + " hasn't  " + informationSecurity2.getDisciplineName() + " in the schedule");
        }

    }
}
