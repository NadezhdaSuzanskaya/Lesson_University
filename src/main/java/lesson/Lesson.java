package lesson;

public abstract class Lesson {
    protected int duration;
    protected String classRoom;

    public Lesson() {
    }

    public Lesson(int duration, String classRoom) {
        this.duration = duration;
        this.classRoom = classRoom;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
//public abstract void printInfo();
}
