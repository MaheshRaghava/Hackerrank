import java.util.*;

public class SortDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String[] dateStrings = input.split(", ");
        List<Date> dates = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);

        try {
            for (String dateStr : dateStrings) {
                dates.add(sdf.parse(dateStr));
            }
            
            Collections.sort(dates);
            
            List<String> sortedDates = new ArrayList<>();
            for (Date date : dates) {
                sortedDates.add(sdf.format(date));
            }
            
            System.out.println(String.join(", ", sortedDates));
        } catch (Exception e) {
            System.out.println("Invalid date format!");
        }
    }
}
