package june30;

import java.io.*;

public class GameObjectWriter {

    public static final String PATH = "src/main/resources/";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Game[] games = new Game[3];
        Game fifa = new Game("Fifa 2020", "iOS", "EA Games", "Casual", 9.0, 2020);
        Game sunshine = new Game("Super Mario Sunshine", "Gamecube", "Nintendo", "3d Platformer", 10.0, 2002);
        Game gta = new Game("GTA San Andreas", "PC", "Rockstar", "Sandbox", 10, 2001);
        games[0] = fifa;
        games[1] = sunshine;
        games[2] = gta;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(PATH + "coolgames.dat"));
        oos.writeObject(games);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PATH + "coolgames.dat"));
        Game[] mygames = (Game[]) ois.readObject();
        for (int i = 0; i < mygames.length; i++) {
            System.out.println(mygames[i]);
        }
    }

}
