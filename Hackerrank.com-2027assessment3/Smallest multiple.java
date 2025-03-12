import java.util.Scanner;

public class SmallestMultiple 
{
    private static int gcd(int a, int b) 
    {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b)
    {
        return (a / gcd(a, b)) * b;
    }

    private static int smallestMultiple(int n)
    {
        int result = 1;
        for (int i = 2; i <= n; i++) 
        {
            result = lcm(result, i);
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) 
        {
            int N = scanner.nextInt();
            System.out.println(smallestMultiple(N));
        }
        
        scanner.close();
    }
}
