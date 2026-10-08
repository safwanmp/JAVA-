import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        int[] merged = new int[n1 + n2];
        int index = 0;
        for (int value : a) {
            merged[index++] = value;
        }
        for (int value : b) {
            merged[index++] = value;
        }
        System.out.println("Merged array:");
        for (int value : merged) {
            System.out.print(value + " ");
        }
        System.out.println();
        sc.close();
    }
}
