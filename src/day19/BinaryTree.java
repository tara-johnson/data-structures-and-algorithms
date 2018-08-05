package day19;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;

    // Returns the root node
    public TreeNode getRoot() {
        return root;
    }

    // Adds a node with a specific value to the tree
    public void add(int val) {
        if (this.root == null) {
            this.root = new TreeNode(val);
            return;
        }
        this.add(val, this.root);
    }

    // Move through the tree until we find a free
    // spot to place the new value
    private void add(int val, TreeNode current) {
        // found a proper spot on the left!
        if (current.left == null && val <= current.data) {
            current.left = new TreeNode(val);
            return;
        }

        // Found a proper spot on the right!
        if (current.right == null && val > current.data) {
            current.right = new TreeNode(val);
            return;
        }

        // Recursive case: move through the tree
        // Move left and right through the tree comparing values
        if (val <= current.data)  {
            add(val, current.left);
        } else if (val > current.data) {
            add(val, current.right);
        }
    }

    // Public traversal method that visits current, left, and right
    private StringBuilder preOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        builder.append(current.data + " ");
        preOrder(builder, current.left);
        preOrder(builder, current.right);

        return builder;
    }

    // Public traversal method that visits left, current, and right
    public StringBuilder inOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        inOrder(builder, current.left);
        builder.append(current.data + " ");
        inOrder(builder, current.right);

        return builder;
    }

    // Public traversal method that visits left, right, and current
    public StringBuilder postOrder(StringBuilder builder, TreeNode current) {
        if (current == null) {
            return builder;
        }

        postOrder(builder, current.left);
        preOrder(builder, current.right);
        builder.append(current.data + " ");

        return builder;
    }

    // Public method that returns an in-order traversal of the tree as a String
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return inOrder(builder, this.root).toString();
    }

    // Public method that returns the number of nodes in the tree
    public int size() {
        return (size(root));
    }

    private int size(TreeNode current) {
        if (current == null) {
            return 0;
        } else {
            return(size(current.left) + size(current.right) + 1);
        }
    }

    // Public method that returns the minimum value in the tree
    public int min() {
        // Sets a pointer to the root node then always moves left
        TreeNode current = this.root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    // Public method that returns the maximum value in the tree
    public int max() {
        // Sets a pointer to the root node then always moves right
        TreeNode current = this.root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    // Public method that returns true or false if the given value is anywhere in the tree
    public boolean contains(int val) {
        return this.contains(val, this.root);
    }

    private boolean contains(int val, TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.data == val) {
            return true;
        }

        boolean wasOnLeft = contains(val, node.left);
        boolean wasOnRight = contains(val, node.right);
        return wasOnLeft || wasOnRight;
    }

    public boolean isIdentical(BinaryTree input) {
        return compareTrees(root, input.root);
    }

    public static boolean compareTrees(TreeNode root1, TreeNode root2) {
        // Create queues to hold the tree nodes
        Queue<TreeNode> qq1 = new LinkedList<>();
        Queue<TreeNode> qq2 = new LinkedList<>();

        // Add respective tree roots to the queues
        qq1.add(root1);
        qq2.add(root2);

        System.out.println("qq1: " + qq1);
        System.out.println("qq2: " + qq2);

        // Declare isIdentical variable, instantiated as true
        boolean isIdentical = true;

        // If both queues are empty return true (they match)
        if (qq1 == null && qq2 == null) {
            System.out.println("The tree is empty");
            return isIdentical;
        }

        while (!qq1.isEmpty() && !qq2.isEmpty()) {
            TreeNode temp1 = qq1.poll();
            System.out.println("temp1: " + temp1);

            TreeNode temp2 = qq2.poll();
            System.out.println("temp2: " + temp2);

            if (temp1 != temp2) {
                isIdentical = false;
                return isIdentical;
            }
        }

        return isIdentical;
    }
}