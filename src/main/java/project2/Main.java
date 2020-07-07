package project2;

import java.util.*;

public class Main {

    private static Scanner keyboard;

    public static void main(String[] args) throws Exception {
        keyboard = new Scanner(System.in);
        System.out.println("Welcome user! Let's play the state capital game!");
        while(true) {
            takeQuiz();
            System.out.println("Play another game? ");
            String answer = keyboard.nextLine();
            if(answer.equals("no")) {
                break;
            }
        }
    }

    public static void takeQuiz() throws Exception {
        Map<String,String> americanStates = XMLReader.getStates();
        // shuffle the map and present ten random questions
        List<String> keys = new ArrayList<String>(americanStates.keySet());
        Collections.shuffle(keys);

        int score = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("What is the state capital of " + keys.get(i) + "?");
            String answer = keyboard.nextLine();
            if( answer.equals( americanStates.get(keys.get(i)) )) {
                System.out.println("Awesome, you got it right! ");
                score += 1;
            } else {
                System.out.println("Sorry wrong answer... " + " it is " + americanStates.get(keys.get(i)));
            }
        }
        System.out.println("Your score is " + score);
    }

}
