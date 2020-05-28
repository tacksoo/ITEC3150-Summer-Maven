
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.RandomStringUtils;

import java.io.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.ggc.edu");
        InputStream is = url.openStream();
        BufferedInputStream bis = new BufferedInputStream(is);
        InputStreamReader isr = new InputStreamReader(bis);
        BufferedReader br = new BufferedReader(isr);
        for (String str = ""; str != null; str = br.readLine()) {
            System.out.println(str);
        }
        String str = IOUtils.toString(is,"UTF-8");
        //System.out.println(str);
        RandomStringUtils.randomAlphabetic(10);

        foobar();
    }

    public static void foobar() {
        // this is a cool plugin!! what is it?
    }

}
