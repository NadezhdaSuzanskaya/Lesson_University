package discipline;

import enums.Departments;
import enums.Semesters;
import lesson.LectureLesson;
import lesson.PracticeLesson;

public class InformationSecurityDiscipline extends Discipline{

    private int group;
    private Semesters teachingSemester ;

    public InformationSecurityDiscipline(){}

    public InformationSecurityDiscipline( String disciplineName, Semesters semesters, LectureLesson lectureLesson, PracticeLesson practiceLesson, int group){
        super(disciplineName, lectureLesson, practiceLesson);
        this.group = group;
        this.teachingSemester = semesters;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        InformationSecurityDiscipline informationSecurity = (InformationSecurityDiscipline) obj;
        return  group == informationSecurity.group
      //          && (department == informationSecurity.department  || (department != null && department.equals(department.getDepartment())))
                && (teachingSemester == informationSecurity.teachingSemester  || (teachingSemester != null && teachingSemester .equals(teachingSemester.getSemester())))
                && (disciplineName == informationSecurity.disciplineName  || (disciplineName != null && disciplineName.equals(informationSecurity.getDisciplineName())));
    }
}
