import java.io.*;
import java.util.*;
public class Solution
    {
    public static void main(String[] args) 
        {
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        String s = String.valueOf(m);
        StringBuilder numStr = new StringBuilder();
        
        for (int i = 0; i < n; i++) 
        {
            numStr.append(s);
        }
        
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            res.append(numStr.charAt(i + (n - 1)));
        }
        System.out.println(Integer.parseInt(res.toString()));
    }
}
