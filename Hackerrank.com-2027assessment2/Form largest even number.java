import java.util.*;
public class LargestEvenNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();  
        Set<Character> uniqueDigits = new HashSet<>();
        List<Character> digits = new ArrayList<>();
        
        for (char ch : input.toCharArray())
        {
            if (Character.isDigit(ch))
            {
                uniqueDigits.add(ch);
            }
        }
        
        digits.addAll(uniqueDigits);
        Collections.sort(digits, Collections.reverseOrder());  
        
        Character evenDigit = null;
        for (int i = digits.size() - 1; i >= 0; i--) 
        {
            if ((digits.get(i) - '0') % 2 == 0) 
            {
                evenDigit = digits.remove(i);
                break;
            }
        }
        
        if (evenDigit == null)
        {
            System.out.println("-1");
            return;
        }
        
        StringBuilder result = new StringBuilder();
        for (char d : digits) 
        {
            result.append(d);
        }
        result.append(evenDigit);  
        
        System.out.println(result);
    }
}
