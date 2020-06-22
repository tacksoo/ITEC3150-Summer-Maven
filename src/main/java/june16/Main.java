package june16;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println((char)getFirstUniqueChar("11233"));
        System.out.println((char)getFirstUniqueChar("aabbcdd"));
    }

    public static int getFirstUniqueChar( String word ) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                int count = map.get(word.charAt(i));
                map.put(word.charAt(i), count + 1);
            } else {
                map.put(word.charAt(i), 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {
            if (map.get(word.charAt(i)) == 1) {
                return word.charAt(i);
            }
        }
        return -1;
    }
}
