package june18;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("nyc");
        list.add("atalanta");
        list.add("miami");
        System.out.println(list);
        list.poll();
        System.out.println(list);
    }

}
