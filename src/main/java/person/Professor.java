package person;

import constants.CalcSalary;
import exceptions.*;
import interfaces.ICalcBonus;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import constants.PersonConstants;
import enums.Departments;
import interfaces.IAskBonus;
import interfaces.IChangeDepartment;

import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class Professor extends Employee implements IAskBonus, IChangeDepartment {
    private int professorDegree;
    private double overTimeHours;
    private byte countOfExam;
    protected Departments department;
    public static int count = 0;
    private static final Logger LOGGER = LogManager.getLogger();

    public Professor() {
    }

    public Professor(String name, String individualNumber, String startDate, int numberOfWorkHours, int professorDegree, double overTimeHours, byte countOfExam, Departments department) {
        super(name, individualNumber, startDate, numberOfWorkHours);
        this.professorDegree = professorDegree;
        this.overTimeHours = overTimeHours;
        this.countOfExam = countOfExam;
        this.department = department;
        count++;
    }


    public int getProfessorDegree() {
        return professorDegree;
    }

    public void setProfessorDegree(int professorDegree) {
        this.professorDegree = professorDegree;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public byte getCountOfExam() {
        return countOfExam;
    }

    public void setCountOfExam(byte countOfExam) {
        this.countOfExam = countOfExam;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }

    @Override
    public double checkCalculationOfBonus() {
        double bonuses;
        bonuses = getProfessorDegree() * PersonConstants.RATE * getOverTimeHours();
        LOGGER.info("METHOD checkCalculationOfBonus() returns a value: " + bonuses);
        return bonuses;

    }

    @Override
    public String toString() {
        return "Professor " + getName() + " with the individual number " + getIndividualNumber() +
                " has been working since : " + getStartDate() + " and gives " + getCountOfExam() + " exams per year." + "His department is: " + department.getDepartment();

    }

    @Override
    public double askPersonalBonus() {
        LOGGER.info("METHOD askPersonalBonus() send value of overTimeHours: " + getOverTimeHours());
        return getOverTimeHours();
    }

    @Override
    public String askBonusForCollege(String name) throws NullValueException, LongValueException, SpecificSymbolException {
        LOGGER.info("BEGIN - askBonusForCollege() methods");
        if (name == "" || name == " ") {
            LOGGER.error("Name value is empty");
            throw new NullValueException();
        } else if (name.length() > 15) {
            LOGGER.error("Name value is too long");
            throw new LongValueException();
        } else if (name.matches("^[a-zA-Z]*$") == false) {
            LOGGER.error("Name value contains not only characters");
            throw new SpecificSymbolException();
        }
        LOGGER.info("END - askBonusForCollege() methods");
        return "I recommend this person" + name + " to receive a bonus for the last month";

    }

    @Override
    public Departments changeDepartment(Departments newDepartment) {
        setDepartment(newDepartment);
        LOGGER.info("METHOD changeDepartment() updates department to: " + newDepartment);
        return getDepartment();
    }

    public void checkNumberOfProfessors() {
        try {
            if (Professor.count < 0) {
                throw new NegativeValueException();
            } else if (Professor.count > 100) {
                throw new LargeNumberException();
            }
        } catch (NegativeValueException exp) {
            LOGGER.error(exp.getMessage());
        } catch (LargeNumberException exp) {
            LOGGER.error(exp.getMessage());
        }
    }

    public double calcProfessorMinSalary() {
        CalcSalary calcSalary = new CalcSalary();
        LOGGER.info("Professor min salary is: " + calcSalary.calcMinSalary(getNumberOfWorkHours()));
        return calcSalary.calcMinSalary(getNumberOfWorkHours());

    }

    public double calcProfessorSalary(double minsal, double bonus) {
        // lambda functions from the java.util.function package
        BinaryOperator<Double> sum = (a, b) -> a + b;
        double result = sum.apply(minsal, bonus);
        LOGGER.info("Professor salary is: " + result);
        return result;
    }


    // Lambda function
    public double calcProfessorBonus(double professorDegree) {
        ICalcBonus<Double, Double> calcProfessorBonus = (x) -> x * getOverTimeHours();
        LOGGER.info("Professor bonus is: " + calcProfessorBonus.calcBonus(professorDegree));
        return calcProfessorBonus.calcBonus(professorDegree);
    }

    public String compareSalaryWithOverage(double profSalary, double overageSalary) {
        // lambda functions from the java.util.function package
        BiPredicate<Double, Double> isGreaterThan = (a, b) -> a > b;
        boolean result = isGreaterThan.test(profSalary, overageSalary);
        if (result == true) {
            LOGGER.info("You salary is above average salary");
            return "You salary is above average salary";
        } else {
            LOGGER.info("You salary is less that overage salary");
            return "You salary is less that overage salary";
        }
    }
}
