package project1;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CityCSVReader {

    public static final String STATES_CSV_URL = "https://gist.githubusercontent.com/tacksoo/07ec0e01122d02f30ef02b3a8418391f/raw/a78acee82835ac9af0b8595651102f16362d0c62/states.csv";
    public static final int NUM_OF_STATES = 50;
    public static String[] getLines() {
        String[] lines = null;
        try {
            URL url = new URL(STATES_CSV_URL);
            String str = IOUtils.toString(url.openStream(),"UTF-8");
            lines = str.split("\n");
            assert lines.length == NUM_OF_STATES  + 1;  // 1 is for the column row
        } catch(MalformedURLException e) {
            System.out.println("Malformed URL");
        } catch(IOException e) {
            System.out.println("Something went wrong during download");
        }
        return lines;
    }

    public static List<City> getCities() {
        String[] lines = getLines();
        List<City> cities = new ArrayList<City>();
        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];
            String[] words = line.split(",");
            assert words.length == 4;  // ensure 4 values (state,name,lat,long) exist from each line
            String state = words[0];
            String name = words[1];
            double latitude = Double.parseDouble(words[2]);
            double longitude = Double.parseDouble(words[3]);
            City city = new City(state,name,latitude,longitude);
            cities.add(city);
        }
        assert cities.size() == NUM_OF_STATES;
        return cities;
    }
}
