import java.util.Scanner;

public class MissesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string:");
        String input = scanner.nextLine();
        scanner.close();

        // Define the characters to be counted as misses
        char[] misses = {'@', '$', '^'};
        int count = 0;

        // Count occurrences of misses in the input string
        for (char c : input.toCharArray()) {
            for (char miss : misses) {
                if (c == miss) {
                    count++;
                }
            }
        }

        // Print the result
        System.out.println(count);
    }
}
