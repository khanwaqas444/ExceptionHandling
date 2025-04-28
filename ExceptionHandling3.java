package exceptionHandling;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        try {
            int num = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
