package enums;

public enum Semesters {
    FIRST_SEMESTER("1th Semester"),
    SECOND_SEMESTER("2nd Semester"),
    THIRD_SEMESTER("3d Semester"),
    FOURTH_SEMESTER("4th Semester"),
    FIFTH_SEMESTER("5th Semester"),
    SIXTH_SEMESTER("6th Semester"),
    SEVENTH_SEMESTER("7th Semester"),
    EIGTH_SEMESTER("8th Semester");

    private final String semester;

    Semesters(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }
}
