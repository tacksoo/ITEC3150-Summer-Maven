package june30;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class GameWriter {

    public static void main(String[] args) throws Exception {
        Game minecraft = new Game("Minecraft","PC","Microsoft","Casual",9.0,2010);
        Game stardew = new Game("Stardew valley", "iOS", "ConcernedApe","Casual",8.0, 2018);
        Game duke3d = new Game("Duke Nukem 3d", "PC", "Silverman","Shooter",10.0, 1991);

        /*
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(duke3d);
        System.out.println(json);
        */
        writeGameToFile(minecraft);
        writeGameToFile(stardew);
        writeGameToFile(duke3d);
        Game g1 = readGame();
        System.out.println(g1);
        Game g2 = readGame();
        System.out.println(g2);
        Game g3 = readGame();
        System.out.println(g3);
    }

    public static Game readGame() throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("src/main/resources/games.dat"));
        String title = dis.readUTF();
        String system = dis.readUTF();
        String dev = dis.readUTF();
        String category = dis.readUTF();
        double rating = dis.readDouble();
        int year = dis.readInt();
        return new Game(title,system,dev,category, rating, year);
    }

    public static void writeGameToFile(Game game) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/games.dat"));
        dos.writeUTF(game.getTitle());
        dos.writeUTF(game.getSystem());
        dos.writeUTF(game.getDeveloper());
        dos.writeUTF(game.getCategory());
        dos.writeDouble(game.getRating());
        dos.writeInt(game.getYear());
        dos.close();
    }
}
