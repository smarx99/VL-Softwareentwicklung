package HW3.hw3_ex3;

public class NoSuchGradeException extends Exception {
    public NoSuchGradeException(double grade) {
        super(String.valueOf(grade));
    }
}
