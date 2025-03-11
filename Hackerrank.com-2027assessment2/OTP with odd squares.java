import java.util.*;

public class OTPGenerator {
    public static void main(String[] args)
    
    {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
       
        
        StringBuilder otpString = new StringBuilder();

        for (String num : input)
        
        {
            int n = Integer.parseInt(num);
            
            
            if (n % 2 != 0)
            
            
             {
                otpString.append(n * n);
             }
        }

        if (otpString.length() >= 4) 
        
        
        {
            System.out.println(otpString.substring(0, 4));
        }
        
        
        else 
        
        
        {
            System.out.println("-1");
        }

        sc.close();
    }
}
'
