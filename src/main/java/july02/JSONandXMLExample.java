package july02;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import june30.Game;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class JSONandXMLExample {

    public static void main(String[] args) throws JsonProcessingException, IOException {

        // for json, i recommend jackson databind library
        // for xml, the jackson dataformat xml

        Game sunshine = new Game("Super Mario Sunshine","Gamecube","Nintendo","3d Platformer", 10.0,2002);
        //json serialization
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(sunshine);
        System.out.println(json);

        //xml serialization
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(sunshine);
        System.out.println(xml);

        FileUtils.writeStringToFile(new File( "sunshine.xml"),xml,"UTF-8");

    }
}
