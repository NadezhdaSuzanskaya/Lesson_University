package person;

public class BachelorDergeeStudent extends Student{

    private boolean finished;
    private String termOfStudy;

    public BachelorDergeeStudent(){}

    public BachelorDergeeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, boolean finished, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook);
        this.finished = finished;
        this.termOfStudy = termOfStudy;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getTermOfStudy() {
        return termOfStudy;
    }

    public void setTermOfStudy(String termOfStudy) {
        this.termOfStudy = termOfStudy;
    }

    @Override
    public String toString() {
        return "Info about First Degree Student: "+"\n"+ "name:"+getName() +"  age:"+getAge()+"  adress:"+getAddress()
                +"  phone:"+getPhone()+"  number of record book:"+getNumberOfRecordBook()
                + "  finished:"+finished+ "  term of study:"+getTermOfStudy()+"\n";
    }
}