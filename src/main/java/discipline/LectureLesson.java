package discipline;

public class LectureLesson extends Discipline{
    private String professorName = "Smitt";
    private byte countOfLecture = 64;

    public LectureLesson() {}

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String lectureName) {
        this.professorName = lectureName;
    }

    public byte getCountOfLecture() {
        return countOfLecture;
    }

    public void setCountOfLecture(byte countOfLecture) {
        this.countOfLecture = countOfLecture;
    }

    @Override
    public void printInfo()  {
        System.out.println("Info about lecture lessons: "+"\n"+"  Professor name is: "+this.getProfessorName() +"  Discipline name is: "
                +this.getDisciplineName()+"  Count of lesson is: " +this.getCountOfLecture()+"\n");
    }


}
