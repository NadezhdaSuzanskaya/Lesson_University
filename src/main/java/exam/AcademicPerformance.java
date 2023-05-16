package exam;

import enums.Disciplines;
import enums.Marks;

import java.util.ArrayList;
import java.util.LinkedList;

public class AcademicPerformance {
    private Disciplines discipline;
    LinkedList<Marks> marks = new LinkedList();

    public AcademicPerformance() {
    }

    public AcademicPerformance(Disciplines discipline, LinkedList<Marks> marks) {
        this.discipline = discipline;
        this.marks = marks;
    }

    public Disciplines getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Disciplines discipline) {
        this.discipline = discipline;
    }

    public LinkedList<Marks> getMarks() {
        return marks;
    }

    public void setMarks(LinkedList<Marks> marks) {
        this.marks = marks;
    }
}
