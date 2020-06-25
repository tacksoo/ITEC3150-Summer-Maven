package binarytree;

import java.util.*;

class LevelOrder {
    public static void main(String[] args) {
        BinaryIntNode seventyTwo = new BinaryIntNode(72);
        BinaryIntNode fourtyOne = new BinaryIntNode(41);
        BinaryIntNode thirtyThree = new BinaryIntNode(33);
        BinaryIntNode sixty = new BinaryIntNode(60, null, seventyTwo);
        BinaryIntNode thirtyEight = new BinaryIntNode(38, thirtyThree, fourtyOne);
        BinaryIntNode twentyOne = new BinaryIntNode(21);
        BinaryIntNode twentySeven = new BinaryIntNode(27, twentyOne, thirtyEight);
        BinaryIntNode fifty = new BinaryIntNode(50, null, sixty);
        BinaryIntNode root = new BinaryIntNode(42, twentySeven, fifty);

        // let's code!!!
        LinkedList<BinaryIntNode> queue = new LinkedList<>();

        // add root node to queue, remove with poll() and
        // add children to queue, repeat
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryIntNode head = queue.poll();
            System.out.print(head.getValue() + " ");
            if (head.getLeftChild() != null) {
                queue.add(head.getLeftChild());
            }
            if (head.getRightChild() != null) {
                queue.add(head.getRightChild());
            }
        }
        System.out.println();
    }
}
