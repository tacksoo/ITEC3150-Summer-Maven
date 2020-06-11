package binarytree;

public class BinaryIntNode {

    private int value;
    private BinaryIntNode leftChild;
    private BinaryIntNode rightChild;

    public BinaryIntNode(int value, BinaryIntNode leftChild, BinaryIntNode rightChild) {
        this.value = value;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryIntNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryIntNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryIntNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryIntNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
