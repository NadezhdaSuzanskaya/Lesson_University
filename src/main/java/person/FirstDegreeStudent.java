package person;

public class FirstDegreeStudent extends Student{


    protected boolean finished;
    private String termOfStudy;
    public FirstDegreeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, boolean finished, String termOfStudy) {

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
    public void printPersonalInfo() {
        System.out.println("Info about First Degree Student: "+"\n"+ "name:"+super.getName() +"  age:"+super.getAge()+"  adress:"+super.getAddress()
                +"  phone:"+super.getPhone()+"  number of record book:"+super.getNumberOfRecordBook()
                + "  finished:"+this.finished+ "  term of study:"+this.getTermOfStudy()+"\n");
    }
}