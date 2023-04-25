package constants;

public final class CalcSalary {

    public static final int MIN_RATE = 55;

    public  double calcMinSalary(int numberOfWorkHours)
    {
        return MIN_RATE *numberOfWorkHours;
    };

}
