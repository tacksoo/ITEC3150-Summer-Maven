package may26;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<String>();
        cities.add("Lawrenceville");
        cities.add("San Francisco");
        cities.add("Seoul");
        List<Double> temperatures = new ArrayList<Double>();
        temperatures.add(70.0);
        temperatures.add(59.0);
        temperatures.add(75.0);
        System.out.printf("%10s %f",cities.get(0),temperatures.get(0));
    }
}
