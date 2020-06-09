package project1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] lines = CityCSVReader.getLines();
        List<City> cities = CityCSVReader.getCities();
        System.out.println(cities);

        City salem = null;
        City austin = null;
        City atlanta = null;
        for (int i = 0; i < cities.size(); i++) {
            if ( cities.get(i).getState().equals( "Oregon")) {
                salem = cities.get(i);
            } else if( cities.get(i).getState().equals("Texas")) {
                austin = cities.get(i);
            } else if( cities.get(i).getState().equals("Georgia")) {
                atlanta = cities.get(i);
            }
        }
        assert salem.getState().equals("Oregon");
        assert austin.getState().equals("Texas");
        assert atlanta.getState().equals("Georgia");
        WeatherHelper.setWeatherInfo(salem);
    }
}
