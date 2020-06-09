package project1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherHelper {

    // need to supply the latitude and longitude and the end
    // e.g.  35,34,120.232
    public static final String DARKSKY_API_URL = "https://api.darksky.net/forecast/3c5084c558861c1610447b49a45f4eb4/";

    public static void setWeatherInfo(City city) {
        try {
            String cityURL = DARKSKY_API_URL + city.getLatitude() + "," + city.getLongitude();
            URL url = new URL(cityURL);
            String str = IOUtils.toString(url.openStream(),"UTF-8");
            assert str.length() > 0;
            ObjectMapper mapper = new ObjectMapper();
            //String x = mapper.writeValueAsString(city);
            //System.out.println(x);
        } catch(MalformedURLException e) {
            System.out.println("Something wrong with DARK sky API URL");
        } catch(IOException e) {
            System.out.println("Something wrong with URL stream");
        }
    }
}
