package enums;

public enum Marks {
    MARK_2(2),
    MARK_3(3),
    MARK_4(4),
    MARK_5(5),
    MARK_6(6);
    private final int mark;

    Marks(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

}
