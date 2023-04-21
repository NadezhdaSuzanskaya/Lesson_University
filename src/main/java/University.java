import discipline.EcomonicDiscipline;
import discipline.InformationSecurityDiscipline;
import lesson.LectureLesson;
import lesson.PracticeLesson;
import person.Assistant;
import person.BachelorDergeeStudent;
import person.MasterDegreeStudent;
import person.Professor;
import person.AdministrativeStaff;

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

        boolean finished = false;


      MasterDegreeStudent masterDegreeStudent = new MasterDegreeStudent(master_name, master_age, master_address, master_phone, master_numberOfRecordBook, master_firstDegree, master_termOfStudy);
      System.out.println(masterDegreeStudent);

      BachelorDergeeStudent firstDegreeStudent = new BachelorDergeeStudent(student_name, student_age, student_address, student_phone, student_numberOfRecordBook, finished, master_termOfStudy);
      System.out.println(firstDegreeStudent);

      Professor professor = new Professor("Doris","12-12-08","12-01-2019", 160, 2,250, (byte) 3);
      System.out.println("Professor salary is: "+professor.calcSalary());
      System.out.println(professor);

      Assistant assistant = new Assistant("Monika","18-88-00","21-02-2000",172,2, 200, (byte) 5);
      System.out.println("Assistent salary is: "+assistant.calcSalary());
      System.out.println(assistant);

      AdministrativeStaff admStaff = new AdministrativeStaff("David ",  "01-01-99", "01-01-1999",168,"laboratory assistant", 400.99);
      System.out.println("Administrative staff salary is: "+admStaff.calcSalary());
      System.out.println(admStaff);

      LectureLesson lectureLesson= new LectureLesson(90, "202B",professor, (byte) 32);
      System.out.println(lectureLesson);

      PracticeLesson practiceLesson = new PracticeLesson(45,"101A", assistant, 30);
      System.out.println(practiceLesson);

      EcomonicDiscipline ecomonicDiscipline1 = new EcomonicDiscipline("Ecomonic", lectureLesson, practiceLesson, 303, "4", "Marketing Faculty");
      EcomonicDiscipline ecomonicDiscipline2 = new EcomonicDiscipline("Ecomonic", lectureLesson, practiceLesson, 304, "4", "Marketing Faculty");

       if (ecomonicDiscipline1.equals(ecomonicDiscipline2))
        {System.out.println("The group "+ecomonicDiscipline1.getGroup()+ " has already "+ecomonicDiscipline2.getDisciplineName()+" in the schedule");}
       else
        {System.out.println("The group "+ecomonicDiscipline1.getGroup()+ " hasn't  "+ecomonicDiscipline2.getDisciplineName()+" in the schedule");}  ;

       InformationSecurityDiscipline informationSecurity1 = new InformationSecurityDiscipline("Information security online", lectureLesson, practiceLesson, 101, "2", "Faculty of Computer Systems");
       InformationSecurityDiscipline informationSecurity2 = new InformationSecurityDiscipline("Information security online", lectureLesson, practiceLesson, 101, "2", "Faculty of Computer Systems");

        if (informationSecurity1.equals(informationSecurity2))
        {System.out.println("The group "+informationSecurity1.getGroup()+ " has already "+informationSecurity2.getDisciplineName()+" in the schedule");}
        else
        {System.out.println("The group "+informationSecurity1.getGroup()+ " hasn't  "+informationSecurity2.getDisciplineName()+" in the schedule");}  ;
    }
}
