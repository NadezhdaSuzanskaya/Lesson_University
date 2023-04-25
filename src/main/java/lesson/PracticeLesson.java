package lesson;

import interfaces.IChangeCountOfLesson;
import person.Assistant;

public class PracticeLesson extends Lesson implements IChangeCountOfLesson {

    private Assistant assistant;
    private byte countOfPractice;

    public PracticeLesson() {
    }

    public PracticeLesson(int duration, String classRoom, Assistant assistant, byte countOfPractice) {
        super(duration, classRoom);
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
    public String toString()  {
       return "Info about practice lessons:"+"\n"+" Assistent name is: "+getAssistant()+
                " Laboratory is: "+getClassRoom()+" Count of lessons is: "+getCountOfPractice();
    }
    @Override
    public byte changeCountOfLesson(byte newCountOfLecture) {
        setCountOfPractice(newCountOfLecture);
        return getCountOfPractice();
    }
}
