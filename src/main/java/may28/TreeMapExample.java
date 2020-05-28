package may28;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap = new LinkedHashMap<Integer,String>();
        studentsMap.put(90001,"johnny");
        studentsMap.put(90002,"sally");
        studentsMap.put(80001,"ezekiel");
        System.out.println(studentsMap);
        Set<String> names = new HashSet<String>();
        names.add("zach");
        names.add("tim");
        names.add("julie");
        names.add("aaron");
        System.out.println(names);
        BiMap<Integer,String> studentsBiMap = HashBiMap.create();
        studentsBiMap.put(90001,"johnny");
        studentsBiMap.put(90002,"sally");
        System.out.println( studentsBiMap.inverse().get("sally"));
        // research multimap and multiset
        // how do you use it and what are the concrete implementations for multimap and mulitset
        //
    }
}
