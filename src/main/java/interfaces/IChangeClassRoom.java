package interfaces;

import enums.NumberOfClassRoom;
import enums.TypeOfClassRoom;

public interface IChangeClassRoom {
    String changeClassRoom(TypeOfClassRoom typeOfClassRoom, NumberOfClassRoom numberOfClassRoom);
}
