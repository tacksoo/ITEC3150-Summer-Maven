package june11;

import java.util.Stack;

public class RecursionExample {

    public static void main(String[] args) {
        System.out.println( add(100) );
    }

    public static int add(int n) {
        Stack<Integer> stack = new Stack<>();
        stack.push(n);
        int sum = 0;
        for(;!stack.isEmpty() && stack.peek() > 0;) {
            int top = stack.pop();
            sum += top;
            stack.push(top-1);
        }
        return sum;
        /*
        if(n == 0) {
            return 0;
        } else {
            return n + add(n-1);
        }
        */
    }


}
