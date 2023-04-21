package lesson;

import person.Assistant;

public class PracticeLesson extends Lesson{

    private Assistant assistant;
    private int countOfPractice;



    public PracticeLesson(int duration, String classRoom, Assistant assistant, int countOfPractice) {
        super(duration, classRoom);
        this.assistant = assistant;
        this.countOfPractice = countOfPractice;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public int getCountOfPractice() {
        return countOfPractice;
    }

    public int setCountOfPractice(int countOfPractice) {
        this.countOfPractice = countOfPractice;
        return countOfPractice;
    }

    @Override
    public String toString()  {
       return "Info about practice lessons:"+"\n"+"Assistent name is: "+getAssistant()+
                " Laboratory is: "+getClass()+"Count of lessons is: "+getCountOfPractice();
    }

}
