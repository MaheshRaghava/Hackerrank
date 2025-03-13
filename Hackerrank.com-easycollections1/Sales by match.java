import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){
      int n,l=1,a[],pair=0;
Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         a=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        Arrays.sort(a, 0, n); 
        for(int i=0;i<a.length;i=i+l)
        {
            l=0;
            int no=a[i];
            for(int j=0;j<n;j++)
            {
                if(no==a[j])
                {
                    l++;
                }
            }
            int temp=0; 
            temp=l;
            pair=pair+temp/2;
        } 
        System.out.print(pair);
    }
}
