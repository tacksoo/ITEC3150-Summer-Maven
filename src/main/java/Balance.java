import java.util.EmptyStackException;
import java.util.Stack;

public class Balance {

    public static void main(String[] args) {
        System.out.println( isBalanced("((1+1))"));
        System.out.println( isBalanced("(())"));
        System.out.println( isBalanced("))(("));
        System.out.println( isBalanced( "(x+1)(y+1)()()()((()))"));
    }

    public static boolean isBalanced(String str) {
        if(str.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if( str.charAt(i) == '(' ) {
                stack.push('(');
            }
            try {
                if (str.charAt(i) == ')') {
                    stack.pop();
                }
            } catch(EmptyStackException e) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
