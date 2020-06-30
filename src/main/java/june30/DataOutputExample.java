package june30;

import java.io.*;

public class DataOutputExample {

    public static void main(String[] args) throws IOException {

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/data.bin"));
        dos.writeInt(42);
        dos.writeShort(7);
        dos.writeDouble(4.2);
        dos.writeUTF("hi");
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("src/main/resources/data.bin"));
        int x = dis.readInt();
        System.out.println(x);
        int y = dis.readShort();
        System.out.println(y);
        double z = dis.readDouble();
        System.out.println(z);
        String g = dis.readUTF();
        System.out.println(g);
        dis.close();
    }

}
