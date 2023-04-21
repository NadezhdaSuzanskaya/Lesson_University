package person;

public class MasterDegreeStudent extends Student{


    private String firstDegree;
    private String termOfStudy;

    public MasterDegreeStudent(){}

    public MasterDegreeStudent(String name, byte age, String address, String phone, String numberOfRecordBook, String firstDegree, String termOfStudy) {

        super(name, age, address, phone, numberOfRecordBook);
        this.firstDegree = firstDegree;
        this.termOfStudy = termOfStudy;
    }

    public String getFirstDegree() {
        return firstDegree;
    }

    public String getTermOfStudy() {
        return termOfStudy;
    }

    public void setFirstDegree(String firstDegree) {
        this.firstDegree = firstDegree;
    }

    public void setTermOfStudy(String termOfStudy) {
        this.termOfStudy = termOfStudy;
    }

    @Override
    public String toString() {
        return "Info about Master Degree Student:"+ "\n"+"name:"+getName()+"  age:"+getAge()+"  adress:"+getAddress()
                +"  phone:"+getPhone()+"  number of record book:"+getNumberOfRecordBook()
                +"  First degree:"+getFirstDegree()+"  term of study:"+getTermOfStudy()+"\n";
    }
}
