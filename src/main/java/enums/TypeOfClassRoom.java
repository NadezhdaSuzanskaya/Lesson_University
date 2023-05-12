package enums;

public  enum TypeOfClassRoom {


    LectureClassRoom {
        @Override
        public String getClassRoomTitle() {
            return "Lecture ClassRoom №:";
        }
    },
    LaboratoryClassRoom {
        @Override
        public String getClassRoomTitle() {
            return "Laboratory ClassRoom №:";
        }
    };

    public abstract String getClassRoomTitle();

}


