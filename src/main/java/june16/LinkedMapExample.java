package june16;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedMapExample {

    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("seattle");
        set.add("san francisco");
        set.add("charleston");
        set.add("new york city");
        System.out.println(set);
    }
}
