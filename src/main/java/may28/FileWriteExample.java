package may28;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileWriteExample {

    public static void main(String[] args) throws Exception {
        File f = new File("src/main/resources/heroes.txt");
        FileUtils.writeStringToFile(f, "This is a line\n","UTF-8",true);
        List<String> passwords = new ArrayList<String>();
        for (int i = 0; i < 1000; i++) {
            passwords.add(RandomStringUtils.randomAlphabetic(10));
        }
        FileUtils.writeLines(f,passwords,false);

        //PrintWriter pw = new PrintWriter("src/main/resources/heroes.txt");
        //pw.println("One Punch Man,Tokyo");
        //pw.println("Ironman:New York");
        //pw.println("Thor:Asgard");
        //pw.close();

    }

}
