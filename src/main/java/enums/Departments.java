package enums;

public enum Departments {
    COMPUTER_SCIENCE("Computer Science"),
    ECONOMIC("Ecomonic"),
    MARKETING("Marketing"),
    INFORMATION_SECURITY("Information Security"),
    ENGINEERING("Engineering"),
    INFORMATION_TECHNOLOGIES("Information Technologies");

    private final String department;

    Departments(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
