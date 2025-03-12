import java.util.Scanner;
public class CircularPrimeSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] isPrime = sieveOfEratosthenes(N);
        int sum = 0;

        for (int i = 2; i < N; i++)
        {
            if (isPrime[i] && isCircularPrime(i, isPrime))
            {
                sum += i;
            }
        }

        System.out.println(sum);
        sc.close();
    }

    static boolean[] sieveOfEratosthenes(int n)
    {
        boolean[] prime = new boolean[n];
        for (int i = 2; i < n; i++) prime[i] = true;
        for (int p = 2; p * p < n; p++) 
        {
            if (prime[p])
            {
                for (int i = p * p; i < n; i += p)
                {
                    prime[i] = false;
                }
            }
        }
        return prime;
    }

    static boolean isCircularPrime(int num, boolean[] isPrime) 
    {
        String s = String.valueOf(num);
        int len = s.length();
        for (int i = 0; i < len; i++) 
        {
            String rotation = s.substring(i) + s.substring(0, i);
            int rotatedNum = Integer.parseInt(rotation);
            if (rotatedNum >= isPrime.length || !isPrime[rotatedNum]) 
            {
                return false;
            }
        }
        return true;
    }
}
