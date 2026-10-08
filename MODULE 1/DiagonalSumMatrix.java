import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int primary = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            primary += arr[i][i];
            secondary += arr[i][n - 1 - i];
        }
        System.out.println("Sum of primary diagonal: " + primary);
        System.out.println("Sum of secondary diagonal: " + secondary);
        sc.close();
    }
}
