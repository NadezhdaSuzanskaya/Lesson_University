import discipline.Exam;
import discipline.Faculty;
import discipline.LectureLesson;
import discipline.PracticeLesson;
import person.Assistant;
import person.FirstDegreeStudent;
import person.MasterDegreeStudent;
import person.Professor;
import person.OtherStaff;

public class University {
    public static void main(String[] args) {
        String student_name="Mike";
        byte   student_age=22;
        String student_address="Warszawa, 03-567, Zytnia 18";
        String student_phone="+48-13-16-789";
        String student_numberOfRecordBook="123-00-764";

        String master_name="Bob";
        byte   master_age=25;
        String master_address="Oslo, 5312, Black 11";
        String master_phone="+22-11-5435";
        String master_numberOfRecordBook="123-00-766";
        String master_firstDegree = "bachelor";
        String master_termOfStudy = "2022-2025";

        double professor_min_salary = 678.50;
        String professor_subject="Logistics";
        double professor_rate=2.5;
        double professor_bonus=350;
        double assistant_bonus=50;
        byte professor_countOfExam=2;

        boolean finished = false;
        String staff_role = "laboratory assistant";


      MasterDegreeStudent masterDegreeStudent = new MasterDegreeStudent(master_name, master_age, master_address, master_phone, master_numberOfRecordBook, master_firstDegree, master_termOfStudy);
      masterDegreeStudent.printPersonalInfo();

      FirstDegreeStudent firstDegreeStudent = new FirstDegreeStudent(student_name, student_age, student_address, student_phone, student_numberOfRecordBook, finished, master_termOfStudy);
      firstDegreeStudent.printPersonalInfo();

      Professor professor = new Professor(professor_min_salary, professor_subject, professor_rate, professor_bonus, professor_countOfExam);
      professor.calcSalary();
      professor.giveLecture();
      professor.giveExam(professor_countOfExam);

      Assistant assistant = new Assistant(professor_min_salary, professor_subject, professor_rate, assistant_bonus);
      assistant.calcSalary();
      assistant.giveLabs();

      OtherStaff otherStaff = new OtherStaff(professor_min_salary, staff_role);
      otherStaff.calcSalary();
      otherStaff.getStaffRole(staff_role);

      LectureLesson lectureLesson= new LectureLesson();
      lectureLesson.printInfo();

      PracticeLesson practiceLesson = new PracticeLesson();
      practiceLesson.printInfo();
      practiceLesson.printInfo(practiceLesson.setAssistentName("Test"), practiceLesson.setDisciplineName("Programming"),practiceLesson.setCountOfLecture(45) );

      Exam exam= new Exam();
      exam.printInfo();

      Faculty faculty = new Faculty();
      faculty.printInfo();








    }
}
