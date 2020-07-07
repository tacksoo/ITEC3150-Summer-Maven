package project2;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws Exception {
        // store states in a map in alphabetic order
        TreeMap<String,String> americanStates = new TreeMap<String,String>();

        List<String> stateNames = XMLReader.getTagContent("//state");
        List<String> stateCapitals = XMLReader.getTagContent("//capital");
        System.out.println(stateNames);
        System.out.println(stateCapitals);

    }
}
