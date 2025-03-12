import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int innum = scanner.nextInt();
        scanner.nextLine();  
        String[] arrInput = scanner.nextLine().split(" ");
        List<Integer> inarr = new ArrayList<>();
        for (String num : arrInput)
        {
            inarr.add(Integer.parseInt(num));
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : inarr)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(freqMap.entrySet());
        sortedEntries.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : sortedEntries)
        {
            int count = entry.getValue();
            if (innum >= count)
            {
                innum -= count;
                freqMap.remove(entry.getKey());
            }
            else 
            {
                entry.setValue(count - innum);
                break;
            }
        }

        System.out.println(freqMap.size());
        scanner.close();
    }
}
