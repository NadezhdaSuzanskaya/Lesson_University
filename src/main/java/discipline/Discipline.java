package discipline;

public abstract class Discipline {
    protected String disciplineName = "Probability theory";

    public Discipline() {}

    public String getDisciplineName() {
        return disciplineName;
    }

    public String setDisciplineName(String disciplineName) {
        this.disciplineName = disciplineName;
        return disciplineName;
    }

public abstract void printInfo();


}
