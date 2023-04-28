package lesson;

import interfaces.IChangeCountOfLesson;
import interfaces.IChangeClassRoom;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.Professor;

import java.util.Objects;

public class LectureLesson extends Lesson implements IChangeCountOfLesson, IChangeClassRoom {
    private static final Logger LOGGER = LogManager.getLogger();
    private Professor professor;
    private byte countOfLecture;

    public LectureLesson() {
    }

    public LectureLesson(int duration, String classRoom, Professor professor, byte countOfLecture) {
        super(duration, classRoom);
        this.professor = professor;
        this.countOfLecture = countOfLecture;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public byte getCountOfLecture() {
        return countOfLecture;
    }

    public void setCountOfLecture(byte countOfLecture) {
        this.countOfLecture = countOfLecture;
    }

    @Override
    public String toString() {
        return "Info about lecture lessons: " + "\n" + "  Professor name is: " + getProfessor() + "  Count of lesson is: "
                + getCountOfLecture() + "  Classroom is: " + getClassRoom() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LectureLesson that = (LectureLesson) o;
        return countOfLecture == that.countOfLecture && Objects.equals(professor, that.professor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(professor, countOfLecture);
    }

    @Override
    public byte changeCountOfLesson(byte newCountOfLecture) {

        setCountOfLecture(newCountOfLecture);
        LOGGER.info("METHOD changeCountOfLesson() updates count of lesson to: " + newCountOfLecture);
        return getCountOfLecture();
    }

    @Override
    public String changeClassRoom(String newClassRoom) {
        setClassRoom(newClassRoom);
        LOGGER.info("METHOD changeClassRoom() updates value of classroom  to: " + newClassRoom);
        return getClassRoom();
    }

}
