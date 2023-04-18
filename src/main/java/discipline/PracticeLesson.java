package discipline;

public class PracticeLesson extends Discipline{

    private String assistentName = "Oliver";
    private int countOfLecture = 55;

    public PracticeLesson() {}



    public String getAssistentName() {
        return assistentName;
    }

    public String setAssistentName(String assistentName) {
        this.assistentName = assistentName;
        return assistentName;
    }

    public int getCountOfLecture() {
        return countOfLecture;
    }

    public int setCountOfLecture(int countOfLecture) {
        this.countOfLecture = countOfLecture;
        return countOfLecture;
    }


    @Override
    public void printInfo()  {
        System.out.println("Info about practice lessons:"+"\n"+"Assistent name is: "+this.getAssistentName()+"  Discipline name is: "+this.getDisciplineName());
    }
    //Overloaded  method
    public void printInfo( String assistentName, String disciplineName, int countOfLesson) {
        System.out.println("Info about practice lessons (overloaded method):"+"\n"+"Assistent name is: "+assistentName+"  Discipline name is: "
                           +disciplineName+"  Count of lesson is: "+countOfLesson+"\n");
    }
}
