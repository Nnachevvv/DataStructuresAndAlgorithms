package data_structures;

import java.util.NoSuchElementException;

class Tree {
    public Tree left;
    public Tree right;
    public int value;

    public Tree(int value) {
        this.value = value;
        this.right = null;
        this.left = null;
    }
}

public class BinaryTree {
    private Tree root;

    public BinaryTree() {
        root = null;

    }

    public void insert(int value) {
        if (root == null) {
            root = new Tree(value);
            return;
        }
        Tree temp = root;
        Tree parentTemp = null;
        while (temp != null) {
            parentTemp = temp;
            if (temp.value < value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        temp = new Tree(value);
        if (parentTemp.value < value) {
            parentTemp.right = temp;
        } else {
            parentTemp.left = temp;
        }
    }

    public Tree search(int value) {
        if (root.value == value) {
            return root;
        }
        Tree temp = root;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            } else if (temp.value < value) {
                temp = temp.right;
            } else {
                temp = temp.left;
            }
        }
        throw new NoSuchElementException("Element is not found.");
    }

    public int minElement() {
        if (root == null) {
            throw new NoSuchElementException("Empty BST.");
        }
        Tree temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.value;
    }

    public int maxElement() {
        if (root == null) {
            throw new NoSuchElementException("Empty BST.");
        }
        Tree temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }
        return temp.value;
    }
}
