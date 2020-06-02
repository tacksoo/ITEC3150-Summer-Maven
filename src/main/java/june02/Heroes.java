package june02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Heroes {

    public static void main(String[] args) throws IOException {
        Map<String,String> heroes = new TreeMap<String,String>();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What is the name of our hero: ");
            String name = scanner.nextLine();
            System.out.println(("What is the hometown of our hero: "));
            String homeTown = scanner.nextLine();
            heroes.put(name, homeTown);
            System.out.println(("Continue? (y/n): "));
            String response = scanner.nextLine();
            if( !response.equals("y") ) {
                break;
            }
        }
        File f = new File("src/main/resources/heroes.txt");
        /*
        for(String name: heroes.keySet() ) {
            String line = name + ":" + heroes.get(name);
            FileUtils.writeStringToFile(f, line + "\n", "UTF-8", true);
        }
        */
        for(Map.Entry<String,String> entry: heroes.entrySet()) {
            String line = entry.getKey() + ":" + entry.getValue();
            FileUtils.writeStringToFile(f, line + "\n", "UTF-8", true);
        }

    }
}
