package may28;

import org.apache.commons.io.FileUtils;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class States {

    public static void main(String[] args) {
        File file = new File("src/main/resources/states.txt");
        try {
            List<String> lines = FileUtils.readLines(file, "UTF-8");
            HashMap<String,String> states = new HashMap<String,String>();
            for(String line: lines) {
                String[] words = line.split(",");
                states.put( words[1], words[0] );
            }
            System.out.println( "The size of the HashMap is " + states.size() );
            System.out.println( "The abbreviation of GA is " + states.get("GA"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
