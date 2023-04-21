package discipline;

import lesson.LectureLesson;
import lesson.PracticeLesson;

public class InformationSecurity extends Discipline{

    private int group;
    private String teachingCourse ;
    private String teachingFaculty ;

    public InformationSecurity(String disciplineName, LectureLesson lectureLesson, PracticeLesson practiceLesson, int group, String teachingCourse, String teachingFaculty) {
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

        InformationSecurity informationSecurity = (InformationSecurity) obj;
        return  group == informationSecurity.group
                && (teachingCourse == informationSecurity.teachingCourse  || (teachingCourse != null && teachingCourse .equals(informationSecurity.getTeachingCourse())))
                && (teachingFaculty == informationSecurity.teachingFaculty  || (teachingFaculty != null && teachingFaculty .equals(informationSecurity.getTeachingFaculty())))
                && (disciplineName == informationSecurity.disciplineName  || (disciplineName != null && disciplineName .equals(informationSecurity.getDisciplineName())));
    }
}
