import java.util.Scanner;

public class MultipleExceptionsFinally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter array size: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter index: ");
            int index = sc.nextInt();
            arr[index] = 50;
            System.out.println("Value assigned.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative.");
        } finally {
            System.out.println("Exception handling completed.");
        }
        sc.close();
    }
}
