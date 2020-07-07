package june30;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.SerializationUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SerializeWithLibrary {
    public static void main(String[] args) throws IOException {
        ArrayList<String> names = new ArrayList<String>();
        names.add("maggie");
        names.add("homer");
        names.add("lisa");

        File file = new File("src/main/resources/simpson2.dat");
        byte[] data = SerializationUtils.serialize(names);
        System.out.println( Arrays.toString(data) );
        FileUtils.writeByteArrayToFile(file,data);
        byte[] data2 = FileUtils.readFileToByteArray(new File("src/main/resources/simpsons.dat"));
        ArrayList<String> simpsons = SerializationUtils.deserialize(data2);
        System.out.println(simpsons );

        //int [] nums = {2,2,324,23,324,3232};
        //System.out.println(Arrays.toString(nums));

        /*
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/simpsons.dat"));
        oos.writeObject(names);
        oos.close();
        */

    }
}
