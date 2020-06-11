package binarytree;

import java.util.Stack;

public class BinaryTreeRunner {

    public static void main(String[] args) {

        BinaryIntNode fourtyTwo = new BinaryIntNode(42, null, null);
        //System.out.println(fourtyTwo);
        BinaryIntNode fourty = new BinaryIntNode(40,null,null);
        BinaryIntNode fifty = new BinaryIntNode(50,null,null);
        fourtyTwo.setLeftChild(fourty);
        fourtyTwo.setRightChild(fifty);

        //      42
        //     /  \
        //    40  50

        // how do i visit all the node of my binary search tree?
        // answer: use recursion
        preOrderIterative(fourtyTwo);
    }

    // visit current node first! then visit left and then right
    public static void preOrder(BinaryIntNode n) {
        if(n == null) {
            return;
        }
        System.out.println(n);
        preOrder(n.getLeftChild());
        preOrder(n.getRightChild());
    }

    public static void inOrder(BinaryIntNode n) {
        if(n == null) {
            return;
        }
        inOrder(n.getLeftChild());
        System.out.println(n);
        inOrder(n.getRightChild());
    }

    public static void postOrder(BinaryIntNode n) {
        if(n == null) {
            return;
        }
        postOrder(n.getLeftChild());
        postOrder(n.getRightChild());
        System.out.println(n);
    }

    public static void preOrderIterative(BinaryIntNode root) {
        Stack<BinaryIntNode> stack = new Stack<BinaryIntNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            BinaryIntNode top = stack.pop();
            System.out.println(top);
            if(top.getRightChild() != null)
                stack.add(top.getRightChild());
            if(top.getLeftChild() != null)
                stack.add(top.getLeftChild());
        }
    }
}
