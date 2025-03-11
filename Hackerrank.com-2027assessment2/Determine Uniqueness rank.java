import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Solution {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int z = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) 
        {
            uniqueElements.add(num);
        }
        int uniqueCount = uniqueElements.size();

        if (uniqueCount == n)
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }
        if (uniqueCount == z)
        {
            System.out.println("Good");
        } else if (uniqueCount < z)
        {
            System.out.println("Bad");
        } else
        {
            System.out.println("Average");
        }
    }
}
