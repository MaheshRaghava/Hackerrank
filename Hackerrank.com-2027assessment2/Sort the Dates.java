import java.util.*;
import java.text.*;

public class SortDates {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String[] dateStrings = input.split(",");
        SimpleDateFormat inputFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        
        List<Date> dates = new ArrayList<>();
        for (String dateStr : dateStrings) {
            dateStr = dateStr.trim();
            Date date = inputFormat.parse(dateStr.substring(0, 2) + " " + dateStr.substring(3, 6).toUpperCase() + " " + dateStr.substring(7));
            dates.add(date);
        }
        
        Collections.sort(dates);
        
        List<String> sortedDateStrings = new ArrayList<>();
        for (Date date : dates) {
            sortedDateStrings.add(outputFormat.format(date));
        }
        
        System.out.println(String.join(", ", sortedDateStrings));
    }
}
5th
