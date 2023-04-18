package discipline;

public class Faculty extends Discipline{
    private String facultyName = "Faculty of information security";
    private String course ="2th";

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public void printInfo() {
        System.out.println("Info about faculty: "+"\n"+"Faculty name is: "+this.getFacultyName()+"  Discipline name is: "+this.getDisciplineName()
                +"  given on the course: "+this.getCourse());

    }
}
