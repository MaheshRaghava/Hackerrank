import java.util.*;
public class AltEvenOdd 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      sc.close();
      List<Character> e = new ArrayList<>(), o = new ArrayList<>();
                 int sp = 0;
                 for (char ch : str.toCharArray())
                  {
                       if (Character.isDigit(ch))
                       {
                           if ((ch - '0') % 2 == 0) e.add(ch);
                                   else o.add(ch);
                            }
                        else if (!Character.isLetter(ch)) sp++;
                      }
                       boolean oddFirst = (sp % 2 != 0);
                      StringBuilder res = new StringBuilder();
                        int i = 0, j = 0;
                        while (i < o.size() || j < e.size()) 
                         {
                             if (oddFirst && i < o.size()) res.append(o.get(i++));
                              if (!oddFirst && j < e.size()) res.append(e.get(j++));
                              oddFirst = !oddFirst;
                            }
                        System.out.println(res.toString().trim());
             }
    }
