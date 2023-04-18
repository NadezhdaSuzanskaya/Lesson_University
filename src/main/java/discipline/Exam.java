package discipline;

public class Exam extends Discipline{
private String termOfExam ="june 2023";
private String nameOfProfessor ="Teddy";

    public String getTermOfExam() {
        return termOfExam;
    }

    public void setTermOfExam(String termOfExam) {
        this.termOfExam = termOfExam;
    }

    public String getNameOfProfessor() {
        return nameOfProfessor;
    }

    public void setNameOfProfessor(String nameOfProfessor) {
        this.nameOfProfessor = nameOfProfessor;
    }

    @Override
    public void printInfo() {
        System.out.println("Info about exams: "+"\n"+"Professor name is: "+this.getNameOfProfessor()
                           +"  Discipline name is: "+this.getDisciplineName()+"  Exam period is: "+this.getTermOfExam()+"\n");

    }
}
