import java.util.Scanner;

public class MissesCounter {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        char[] misses = {'@', '$', '^'};
        int count = 0;
        for (char c : input.toCharArray())
        {
            for (char miss : misses)
            {
                if (c == miss)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
