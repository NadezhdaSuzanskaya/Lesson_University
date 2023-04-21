package discipline;

import lesson.LectureLesson;
import lesson.PracticeLesson;

public class EcomonicDiscipline extends Discipline{
    private int group;
    private String teachingCourse ;
    private String teachingFaculty ;

    public EcomonicDiscipline(){}

    public EcomonicDiscipline(String disciplineName, LectureLesson lectureLesson, PracticeLesson practiceLesson, int group, String teachingCourse, String teachingFaculty) {
        super(disciplineName, lectureLesson, practiceLesson);
        this.group = group;
        this.teachingCourse = teachingCourse;
        this.teachingFaculty = teachingFaculty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getTeachingCourse() {
        return teachingCourse;
    }

    public void setTeachingCourse(String teachingCourse) {
        this.teachingCourse = teachingCourse;
    }

    public String getTeachingFaculty() {
        return teachingFaculty;
    }

    public void setTeachingFaculty(String teachingFaculty) {
        this.teachingFaculty = teachingFaculty;
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

        EcomonicDiscipline ecomonicDiscipline = (EcomonicDiscipline) obj;
        return  group == ecomonicDiscipline.group
                && (teachingCourse == ecomonicDiscipline.teachingCourse  || (teachingCourse != null && teachingCourse .equals(ecomonicDiscipline.getTeachingCourse())))
                && (teachingFaculty == ecomonicDiscipline.teachingFaculty  || (teachingFaculty != null && teachingFaculty .equals(ecomonicDiscipline.getTeachingFaculty())))
                && (disciplineName == ecomonicDiscipline.disciplineName  || (disciplineName != null && disciplineName .equals(ecomonicDiscipline.getDisciplineName())));
    }
}
