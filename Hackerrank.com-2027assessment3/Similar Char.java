import java.util.Scanner;

public class SimilarChar
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int Q = sc.nextInt();
        int[][] prefixFreq = new int[26][N + 1];

        for (int i = 1; i <= N; i++)
        {
            char ch = S.charAt(i - 1);
            for (int j = 0; j < 26; j++)
            {
                prefixFreq[j][i] = prefixFreq[j][i - 1];
            }
            prefixFreq[ch - 'a'][i]++;
        }

        for (int i = 0; i < Q; i++)
        {
            int P = sc.nextInt();
            char ch = S.charAt(P - 1);
            int occurrencesBeforeP = prefixFreq[ch - 'a'][P - 1];
            System.out.println(occurrencesBeforeP);
        }

        sc.close();
    }
}
