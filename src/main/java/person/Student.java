package person;

import enums.Departments;

public abstract class Student extends Person {
    protected String numberOfRecordBook;
    protected Departments department;

    public Student() {
    }

    //creating a parameterized constructor
    public  Student(String name, byte age, String address,String phone, String numberOfRecordBook, Departments department){
        super(name, age, address, phone);
        this.numberOfRecordBook=numberOfRecordBook;
        this.department= department;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    public String getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public void setNumberOfRecordBook(String numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

}
