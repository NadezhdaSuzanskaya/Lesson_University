package lesson;

import enums.NumberOfClassRoom;
import enums.TypeOfClassRoom;
import exceptions.LargeNumberException;
import exceptions.NegativeValueException;
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

    public static int count = 0;
    public LectureLesson() {
    }

    public LectureLesson(int duration, TypeOfClassRoom classRoom, NumberOfClassRoom numberOfClassRoom, Professor professor, byte countOfLecture) {
        super(duration, classRoom, numberOfClassRoom);
        this.professor = professor;
        this.countOfLecture = countOfLecture;
        count++;
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
                + getCountOfLecture() + "  Classroom is: " + typeOfClassRoom.getClassRoomTitle() + numberOfClassRoom.getNumberOfClassRoom()+"\n";
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
    public String changeClassRoom(TypeOfClassRoom newClassRoom, NumberOfClassRoom newNumberOfClassRoom) {
        setTypeOfClassRoom(newClassRoom);
        setNumberOfClassRoom(newNumberOfClassRoom);
        LOGGER.info("METHOD changeClassRoom() updates value of classroom  to: " + newClassRoom + " " +newNumberOfClassRoom);
        String newValueOfClassRoom =  getTypeOfClassRoom().toString()+" "+ getNumberOfClassRoom().toString();
        return newValueOfClassRoom;
    }
    //check NegativeValueException and LargeNumberException
    public void checkNumberOfLecture()
    {
        try {
            if (count > 0 && count < 100) {
                LOGGER.info("Count of Lecture lesson is "+count);
            } else if (count <= 0) {
                throw new NegativeValueException();
            } else {
                throw new LargeNumberException();
            }
        } catch (NegativeValueException exp) {
            LOGGER.error(exp.getMessage());
        } catch (LargeNumberException exp) {
            LOGGER.error(exp.getMessage());
        }
    }
}
