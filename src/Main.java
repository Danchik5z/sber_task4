import java.util.List;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<City> cities = CityUtils.parse();

        quantityOfCitiesByRegion(cities);
    }


    private static void quantityOfCitiesByRegion(List<City> cities) {
        cities.stream()
                .collect(Collectors.groupingBy(
                        City::getRegion, Collectors.counting()))
                .forEach((s, count) -> System.out.println(s + " - " + count));

    }
}