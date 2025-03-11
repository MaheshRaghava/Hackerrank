import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquenessRank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = scanner.nextInt(); // Read N
        int z = scanner.nextInt(); // Read Z

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt(); // Read array elements
        }

        // Check uniqueness
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }
        int uniqueCount = uniqueElements.size();

        if (uniqueCount == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        // Determine the uniqueness rank
        if (uniqueCount == z) {
            System.out.println("Good");
        } else if (uniqueCount < z) {
            System.out.println("Bad");
        } else {
            System.out.println("Average");
        }

        scanner.close();
    }
}
