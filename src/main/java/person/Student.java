package person;

public abstract class Student extends Person {
    protected String numberOfRecordBook;

    //creating a parameterized constructor
    Student(String name, byte age, String address,String phone, String numberOfRecordBook){
        super(name, age, address, phone);
        this.numberOfRecordBook=numberOfRecordBook;
    }

    public String getNumberOfRecordBook() {
        return numberOfRecordBook;
    }

    public void setNumberOfRecordBook(String numberOfRecordBook) {
        this.numberOfRecordBook = numberOfRecordBook;
    }

}
