package june30;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GameWriter {

    public static void main(String[] args) throws Exception {
        Game minecraft = new Game("Minecraft", "PC", "Microsoft", "Casual", 9.0, 2010);
        Game stardew = new Game("Stardew valley", "iOS", "ConcernedApe", "Casual", 8.0, 2018);
        Game duke3d = new Game("Duke Nukem 3d", "PC", "Silverman", "Shooter", 10.0, 1991);

        /*
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(duke3d);
        System.out.println(json);
        */
        List<Game> games = new ArrayList<Game>();
        games.add(minecraft);
        games.add(stardew);
        games.add(duke3d);
        writeGamesToFile(games);
        List<Game> retrivedGames = readGames(3);
        System.out.println(retrivedGames);
    }

    public static List<Game> readGames(int n) throws Exception {
        List<Game> games = new ArrayList<Game>();
        DataInputStream dis = new DataInputStream(new FileInputStream("src/main/resources/games.dat"));
        for (int i = 1; i <= n; i++) {
            String title = dis.readUTF();
            String system = dis.readUTF();
            String dev = dis.readUTF();
            String category = dis.readUTF();
            double rating = dis.readDouble();
            int year = dis.readInt();
            games.add(new Game(title, system, dev, category, rating, year));
        }
        return games;
    }

    public static void writeGamesToFile(List<Game> games) throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/games.dat"));
        for (Game g : games) {
            dos.writeUTF(g.getTitle());
            dos.writeUTF(g.getSystem());
            dos.writeUTF(g.getDeveloper());
            dos.writeUTF(g.getCategory());
            dos.writeDouble(g.getRating());
            dos.writeInt(g.getYear());
        }
        dos.close();
    }
}
