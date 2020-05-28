package may28;

import java.util.HashMap;

public class UniqueChar {

    public static void main(String[] args) {
        //printFirstUniqueChar("dictionary");
        printFirstUniqueChar("georgia");
        printFirstUniqueChar("acanalamanapanama");

    }

    /**
     * Given a string, print the first unique character and return it
     * "ggc" --> 'c'
     * "friend" --> 'f'
     * "itec3150" --> 'i'
     *
     * @param str given string
     */
    public static void printFirstUniqueChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        // build map of chars and their count
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if( map.containsKey(current)) {
                int count = map.get(current);
                count += 1;
                map.put( current, count);
            } else {
                map.put( current, 1);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
