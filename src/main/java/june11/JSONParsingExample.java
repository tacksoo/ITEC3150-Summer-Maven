package june11;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.IOUtils;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class JSONParsingExample {

    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL("https://www.cheapshark.com/api/1.0/deals");
        String str = IOUtils.toString(url,"UTF-8");
        List<Object> items = mapper.readValue(str,List.class);
        for(Object o: items) {
            Map<String, String> game = (Map) o;
            System.out.println(game.get("title") + " " + game.get("salePrice"));
        }
    }
}
