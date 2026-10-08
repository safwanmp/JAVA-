import java.util.Scanner;

public class LargestSmallest2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int largest = arr[0][0];
        int smallest = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > largest) largest = arr[i][j];
                if (arr[i][j] < smallest) smallest = arr[i][j];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}
