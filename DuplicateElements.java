import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int value : arr) {
            if (!seen.add(value)) {
                duplicate.add(value);
            }
        }
        if (duplicate.isEmpty()) {
            System.out.println("No duplicates found");
        } else {
            System.out.println("Duplicate elements: " + duplicate);
        }
        sc.close();
    }
}
