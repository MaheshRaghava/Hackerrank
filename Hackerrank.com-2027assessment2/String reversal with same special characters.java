import java.util.*;

public class ReverseAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        char[] chars = input.toCharArray();
        List<Character> alphanumeric = new ArrayList<>();
        
        for (char ch : chars) {
            if (Character.isLetterOrDigit(ch)) {
                alphanumeric.add(ch);
            }
        }
        
        Collections.reverse(alphanumeric);
        
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                chars[i] = alphanumeric.get(index++);
            }
        }
        
        System.out.println(new String(chars));
    }
}
