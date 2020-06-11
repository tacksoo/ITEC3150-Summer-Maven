package project1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class WeatherHelper {

    // need to supply the latitude and longitude and the end
    // e.g.  35,34,120.232
    public static final String DARKSKY_API_URL = "https://api.darksky.net/forecast/3c5084c558861c1610447b49a45f4eb4/";

    /**
     * Get JSON weather data for a given city
     * @param city the city for which you want the weather data
     * @return JSON string of weather data
     */
    private static String getWeatherJSON(City city) {
        String json = "";
        try {
            String cityURL = DARKSKY_API_URL + city.getLatitude() + "," + city.getLongitude();
            URL url = new URL(cityURL);
            json = IOUtils.toString(url.openStream(), "UTF-8");
            assert json.length() > 0;
        }
        catch(MalformedURLException e) {
            System.out.println("Something wrong with DARK sky API URL");
        } catch(IOException e) {
            System.out.println("Something wrong with URL stream");
        }
        return json;
    }

    /**
     * Sets weather information for a given city
     * @param city city object for which you are setting the weather
     */
    public static void setWeatherInfo(City city) {
        try {
            String json = getWeatherJSON(city);
            // parse JSON to grab temp, uvindex, and rain info
            ObjectMapper mapper = new ObjectMapper();
            Map<String,Object> map = mapper.readValue(json,Map.class);
            Map<String,Object> currentlyMap = (Map) map.get("currently");
            double temp = 0;
            try {
                temp = (double) currentlyMap.get("temperature");
            } catch(ClassCastException e) {
                temp = (int) currentlyMap.get("temperature");
            }
            int uvIndex = (int) currentlyMap.get("uvIndex");
            assert temp <= 1000 && temp > -1000;
            assert uvIndex >= 0;
            boolean isRaining = ((String) currentlyMap.get("summary")).toLowerCase().contains("rain");
            city.setTemperature(temp);
            city.setUvIndex(uvIndex);
            city.setRaining(isRaining);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
