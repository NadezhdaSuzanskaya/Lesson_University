package person;

public class MasterDegreeStudent extends Student{


    private String firstDegree;
    private String termOfStudy;
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
    public void printPersonalInfo() {
        System.out.println("Info about Master Degree Student:"+ "\n"+"name:"+super.getName()+"  age:"+super.getAge()+"  adress:"+super.getAddress()
                +"  phone:"+super.getPhone()+"  number of record book:"+super.getNumberOfRecordBook()
                +"  First degree:"+this.getFirstDegree()+"  term of study:"+this.getTermOfStudy()+"\n");
    }
}
