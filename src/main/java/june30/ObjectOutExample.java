package june30;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutExample {

    public static void main(String[] args) throws Exception {
        /*
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/game.dat"));
        Game papersPlease = new Game("Papers Please","PC","Some dude","Casual",7.0,2015);
        oos.writeObject(papersPlease);
        oos.close();
        */


        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/game.dat"));
        Game papers = (Game) ois.readObject();
        System.out.println(papers);


    }
}
