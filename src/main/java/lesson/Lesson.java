package lesson;

import enums.NumberOfClassRoom;
import enums.TypeOfClassRoom;

public abstract class Lesson {
    protected int duration;
    //protected String classRoom;
    protected TypeOfClassRoom typeOfClassRoom;
    protected NumberOfClassRoom numberOfClassRoom;
    public Lesson() {
    }

    public Lesson(int duration, TypeOfClassRoom classRoom, NumberOfClassRoom numberOfClassRoom) {
        this.duration = duration;
        this.typeOfClassRoom = classRoom;
        this.numberOfClassRoom = numberOfClassRoom;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }


    public TypeOfClassRoom getTypeOfClassRoom() {
        return typeOfClassRoom;
    }

    public void setTypeOfClassRoom(TypeOfClassRoom typeOfClassRoom) {
        this.typeOfClassRoom = typeOfClassRoom;
    }

    public NumberOfClassRoom getNumberOfClassRoom() {
        return numberOfClassRoom;
    }

    public void setNumberOfClassRoom(NumberOfClassRoom numberOfClassRoom) {
        this.numberOfClassRoom = numberOfClassRoom;
    }
}
