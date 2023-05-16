package discipline;

import enums.Departments;
import lesson.LectureLesson;
import lesson.PracticeLesson;

public abstract class Faculty {

    protected String disciplineName;
    protected LectureLesson lectureLesson;
    protected PracticeLesson practiceLesson;


    public Faculty() {
    }

    public Faculty(String disciplineName, LectureLesson lectureLesson, PracticeLesson practiceLesson) {
        this.disciplineName = disciplineName;
        this.lectureLesson = lectureLesson;
        this.practiceLesson = practiceLesson;
    }

    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
    }

    public LectureLesson getLectureLesson() {
        return lectureLesson;
    }

    public void setLectureLesson(LectureLesson lectureLesson) {
        this.lectureLesson = lectureLesson;
    }

    public PracticeLesson getPracticeLesson() {
        return practiceLesson;
    }

    public void setPracticeLesson(PracticeLesson practiceLesson) {
        this.practiceLesson = practiceLesson;
    }
}
