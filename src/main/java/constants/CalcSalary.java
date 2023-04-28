package constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CalcSalary {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final int MIN_RATE = 55;

    public CalcSalary() {
    }

    public double calcMinSalary(int numberOfWorkHours) {
        double minSalary;
        minSalary = MIN_RATE * numberOfWorkHours;
        LOGGER.info("METHOD calcMinSalary returns: " + minSalary);
        return minSalary;
    }

    ;

}
