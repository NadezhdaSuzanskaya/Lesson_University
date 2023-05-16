package enums;

public enum Disciplines {
    HISTORY("History"),
    ENGLISH("English language"),
    JAVA_BASIC("Java basic"),
    PYTHON_BASIC("Python basic"),
    PHILOSOPHY("Philosophy"),
    INFORMATION_SECURITY("Information security");

    private final String discipline;

    Disciplines(String discipline) {
        this.discipline = discipline;
    }

    public String getDiscipline() {
        return discipline;
    }
//non-static block
    {
        System.out.println("Just non - static block in Disciplines enum"+getDiscipline());
    }
}
