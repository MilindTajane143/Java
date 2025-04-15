import java.util.HashMap;
import java.util.Map;

public class CountryCapitalMap {
    public static void main(String[] args) {
        HashMap<String, String> countryCapital = new HashMap<>();
        countryCapital.put("India", "New Delhi");
        countryCapital.put("USA", "Washington, D.C.");
        countryCapital.put("France", "Paris");
        countryCapital.put("Japan", "Tokyo");
        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " +
                    entry.getValue());
        }
    }
}