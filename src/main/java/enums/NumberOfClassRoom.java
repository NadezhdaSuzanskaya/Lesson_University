package enums;

public enum NumberOfClassRoom {

    CLASSROOM_101("101"),
    CLASSROOM_100A("100A"),
    CLASSROOM_210("210"),
    CLASSROOM_311("311");

    private final String numberOfClassRoom;

    NumberOfClassRoom(String numberOfClassRoom) {
        this.numberOfClassRoom = numberOfClassRoom;
    }

    public String getNumberOfClassRoom() {
        return numberOfClassRoom;
    }

    static {
            System.out.println("Just static block in NumberOfClassRoom enum");
        }
}
