import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        int misscount=0;
        for(char ch:input.toCharArray()){
            if(!Character.isLetterOrDigit(ch)&& ch !=' '){
                misscount++;
            }
        }
        System.out.println(misscount);
        
    }
}
