import java.util.Scanner;

public class DivisionException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            int a = sc.nextInt();
            System.out.print("Enter divisor: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
        sc.close();
    }
}
