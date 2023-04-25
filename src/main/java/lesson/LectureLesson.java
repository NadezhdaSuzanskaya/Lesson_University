package lesson;

import interfaces.IChangeCountOfLesson;
import interfaces.IChangeClassRoom;
import person.Professor;

public class LectureLesson extends Lesson implements IChangeCountOfLesson, IChangeClassRoom {
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
    public String toString () {
        return "Info about lecture lessons: "+"\n"+"  Professor name is: "+getProfessor() +"  Count of lesson is: "
                +getCountOfLecture()+"  Classroom is: " +getClassRoom()+"\n";
    }


    @Override
    public byte changeCountOfLesson(byte newCountOfLecture) {
        setCountOfLecture(newCountOfLecture);
        return getCountOfLecture();
    }

    @Override
    public String changeClassRoom(String newClassRoom) {
        setClassRoom(newClassRoom);
        return getClassRoom();
    }
}
