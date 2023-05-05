package discipline;

public class AddingDiscipline <T>{
    private T t;
    int modCount=0;
    public AddingDiscipline(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
