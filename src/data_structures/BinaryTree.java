package data_structures;

import java.util.NoSuchElementException;

//TODO tests
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

    public boolean remove(int value) {
        if (root == null) {
            throw new NoSuchElementException();
        }

        Tree previous = null;
        Tree current = root;
        while (current != null) {
            if (current.value == value) {
                deleteNode(previous, current, value);
                return true;
            }

            previous = current;
            if (current.value < value) {
                current = root.right;
            } else {
                current = root.left;
            }
        }
        return false;
    }

    private void deleteNode(Tree previous, Tree current, int value) {

        boolean deletePos = false;//false for left , true for right pos

        if (previous.value < value) {
            deletePos = true;
        }

        if (current.left == null && current.right == null) {
            if (deletePos) previous.right = null;
            else previous.left = null;
        } else if (current.left != null && current.right == null) {
            if (deletePos) previous.right = current.left;
            else previous.left = current.left;
        } else if (current.left == null) {
            if (deletePos) previous.right = current.right;
            else previous.left = current.right;
        } else {
            Tree temp = current.right;
            Tree parentTemp = null;
            while (temp.left != null) {
                parentTemp = temp;
                temp = temp.left;
            }
            current.value = temp.value;
            parentTemp.left = null;
        }
        current = null;
    }


    public Tree minElement() {
        if (root == null) {
            throw new NoSuchElementException("Empty BST.");
        }
        Tree temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }

    public Tree maxElement() {
        if (root == null) {
            throw new NoSuchElementException("Empty BST.");
        }
        Tree temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }
        return temp;
    }

    public void print() {
        Tree temp = root;
        printInOrder(temp);
    }

    private void printInOrder(Tree node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        System.out.print(node.value + " ");
        printInOrder(node.right);
    }

    private void printPreOrder(Tree node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        printInOrder(node.left);
        printInOrder(node.right);
    }

    private void printPostOrder(Tree node) {
        if (node == null) {
            return;
        }
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.print(node.value + " ");
    }
}
