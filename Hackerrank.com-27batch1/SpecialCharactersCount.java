import java.util.*;
public class Solution 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 0;
        for (int i = 0; i < n.length(); i++) 
        {
            char c = n.charAt(i);
            if (c == '$' || c == '@' || c == '^') 
            {
                count++; 
            }
        }
        System.out.println(count);
    }
}
