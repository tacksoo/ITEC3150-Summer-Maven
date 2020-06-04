package project1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] lines = CityCSVReader.getLines();
        List<City> cities = CityCSVReader.getCities();
    }
}
