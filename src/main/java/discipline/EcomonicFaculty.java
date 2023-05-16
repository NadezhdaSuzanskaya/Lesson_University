package discipline;

import enums.Semesters;
import lesson.LectureLesson;
import lesson.PracticeLesson;

public class EcomonicFaculty extends Faculty {
    private int group;
    private Semesters teachingSemester;

    public EcomonicFaculty() {
    }

    public EcomonicFaculty(String disciplineName, Semesters semesters, LectureLesson lectureLesson, PracticeLesson practiceLesson, int group) {
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

        EcomonicFaculty ecomonicDiscipline = (EcomonicFaculty) obj;
        return group == ecomonicDiscipline.group
                // && (department == ecomonicDiscipline.department  || (department != null && department.equals(department.getDepartment())))
                && (teachingSemester == ecomonicDiscipline.teachingSemester || (teachingSemester != null && teachingSemester.equals(teachingSemester.getSemester())))
                && (disciplineName == ecomonicDiscipline.disciplineName || (disciplineName != null && disciplineName.equals(ecomonicDiscipline.getDisciplineName())));
    }
}
