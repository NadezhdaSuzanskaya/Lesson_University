package discipline;

import enums.Semesters;
import lesson.LectureLesson;
import lesson.PracticeLesson;

public class InformationSecurityFaculty extends Faculty {

    private int group;
    private Semesters teachingSemester;

    public InformationSecurityFaculty() {
    }

    public InformationSecurityFaculty(String disciplineName, Semesters semesters, LectureLesson lectureLesson, PracticeLesson practiceLesson, int group) {
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

    public Semesters getTeachingSemester() {
        return teachingSemester;
    }

    public void setTeachingSemester(Semesters teachingSemester) {
        this.teachingSemester = teachingSemester;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        InformationSecurityFaculty informationSecurity = (InformationSecurityFaculty) obj;
        return group == informationSecurity.group
                //          && (department == informationSecurity.department  || (department != null && department.equals(department.getDepartment())))
                && (teachingSemester == informationSecurity.teachingSemester || (teachingSemester != null && teachingSemester.equals(teachingSemester.getSemester())))
                && (disciplineName == informationSecurity.disciplineName || (disciplineName != null && disciplineName.equals(informationSecurity.getDisciplineName())));
    }
}
