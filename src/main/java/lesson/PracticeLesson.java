package lesson;

import enums.NumberOfClassRoom;
import enums.TypeOfClassRoom;
import interfaces.IChangeCountOfLesson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import person.Assistant;

import java.util.Objects;

public class PracticeLesson extends Lesson implements IChangeCountOfLesson {
    private static final Logger LOGGER = LogManager.getLogger();
    private Assistant assistant;
    private byte countOfPractice;

    public PracticeLesson() {
    }

    public PracticeLesson(int duration, TypeOfClassRoom classRoom, NumberOfClassRoom numberOfClassRoom, Assistant assistant, byte countOfPractice) {
        super(duration, classRoom, numberOfClassRoom);
        this.assistant = assistant;
        this.countOfPractice = countOfPractice;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public byte getCountOfPractice() {
        return countOfPractice;
    }

    public byte setCountOfPractice(byte countOfPractice) {
        this.countOfPractice = countOfPractice;
        return countOfPractice;
    }

    @Override
    public String toString() {
        return "Info about practice lessons:" + "\n" + " Assistent name is: " + getAssistant() +
                " Laboratory is: " + typeOfClassRoom.getClassRoomTitle() + numberOfClassRoom.getNumberOfClassRoom() + " Count of lessons is: " + getCountOfPractice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PracticeLesson that = (PracticeLesson) o;
        return countOfPractice == that.countOfPractice && Objects.equals(assistant, that.assistant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(assistant, countOfPractice);
    }

    @Override
    public byte changeCountOfLesson(byte newCountOfLecture) {
        setCountOfPractice(newCountOfLecture);
        LOGGER.info("METHOD changeCountOfLesson() updates count of lecrute to: "+newCountOfLecture);
        return getCountOfPractice();
    }
}
