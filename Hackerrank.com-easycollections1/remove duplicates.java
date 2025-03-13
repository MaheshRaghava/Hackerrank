import java.io.*;
import java.util.*;

public class Solution
{
    public static String removeDuplicates(String input)
    {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : input.toCharArray())
        {
            seen.add(c);
        }
        StringBuilder result = new StringBuilder();
        for (char c : seen)
        {
            result.append(c);
        }
        
        return result.toString();
    }

    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String result = removeDuplicates(input);
        System.out.println(result);
        
        bufferedReader.close();
    }
}
