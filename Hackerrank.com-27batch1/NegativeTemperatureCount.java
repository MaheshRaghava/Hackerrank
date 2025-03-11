import java.util.Scanner;  // Import Scanner class for user input

public class NegativeTemperatureCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object for input

        // Read the number of products
        int numOfProducts = scanner.nextInt();  // Read N (number of products)

        int count = 0; // Counter to keep track of negative temperatures

        // Read temperatures and count how many are negative
        for (int i = 0; i < numOfProducts; i++) {
            int temp = scanner.nextInt();  // Read temperature
            if (temp < 0) {  // Check if it is negative
                count++;  // Increment counter
            }
        }

        // Print the final count of negative temperature products
        System.out.println(count);

        scanner.close();  // Close the scanner
    }
}
