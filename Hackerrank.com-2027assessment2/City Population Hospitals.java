import java.util.*;

public class CitySorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] cityData = input.split(",");
        int n = cityData.length / 3;

        List<String[]> cities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String name = cityData[i * 3];
            int population = Integer.parseInt(cityData[i * 3 + 1]);
            int hospitals = Integer.parseInt(cityData[i * 3 + 2]);
            cities.add(new String[]{name, String.valueOf(population), String.valueOf(hospitals)});
        }

        List<String[]> arr1 = new ArrayList<>(cities);
        List<String[]> arr2 = new ArrayList<>(cities);

        arr1.sort(Comparator.comparingInt(a -> Integer.parseInt(a[1]))); // Ascending order of population
        arr2.sort((a, b) -> Integer.parseInt(b[2]) - Integer.parseInt(a[2])); // Descending order of hospitals

        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr1.get(i)[0].equals(arr2.get(i)[0])) {
                result.add(arr1.get(i)[0].toUpperCase());
            }
        }

        System.out.println(result.isEmpty() ? "-1" : String.join("", result));
    }
}
