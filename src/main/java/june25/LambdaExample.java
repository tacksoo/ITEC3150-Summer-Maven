package june25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.forEach( x -> System.out.print(2*x + " " ));
        List<String> names = new ArrayList<String>();
        names.add("bob");
        names.add("lisa");
        names.add("tom");
        names.replaceAll( x -> x + "@ggc.edu");
        System.out.println(names);
        List<Double> scores = new ArrayList<Double>();
        scores.add(7.7);
        scores.add(8.5);
        scores.add(5.0);
        scores.removeIf( x -> x < 6.0);
        System.out.println(scores);
    }
}
