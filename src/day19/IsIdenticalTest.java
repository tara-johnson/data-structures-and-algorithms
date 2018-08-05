package day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIdenticalTest {

    @Test
    void isIdenticalEmptyTreesTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();

        Boolean expected = true;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalOneEmptyTreeTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(8);

        TreeNode n2 = new TreeNode(7);

        TreeNode n3 = new TreeNode(2);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;

        n1.right = n3;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();

        Boolean expected = false;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalSingleNodeTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(2);

        // Connect nodes
        tree1.root = n1;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(2);

        // Connect nodes
        tree2.root = n1;

        Boolean expected = true;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalSameTreesTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(11);

        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(18);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(2);

        n2 = new TreeNode(7);
        n3 = new TreeNode(2);
        n4 = new TreeNode(6);
        n5 = new TreeNode(5);
        n6 = new TreeNode(11);

        n7 = new TreeNode(5);
        n8 = new TreeNode(9);
        n9 = new TreeNode(18);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Boolean expected = true;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalMiddleNodeDifferentTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(11);

        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(18);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(2);

        n2 = new TreeNode(7);
        n3 = new TreeNode(2);
        n4 = new TreeNode(6);
        n5 = new TreeNode(3);
        n6 = new TreeNode(11);

        n7 = new TreeNode(5);
        n8 = new TreeNode(9);
        n9 = new TreeNode(18);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Boolean expected = false;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalTree1BiggerTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(11);

        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(18);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(2);

        n2 = new TreeNode(7);
        n3 = new TreeNode(2);
        n4 = new TreeNode(6);
        n5 = new TreeNode(5);

        n7 = new TreeNode(5);
        n8 = new TreeNode(9);
        n9 = new TreeNode(18);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Boolean expected = false;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

    @Test
    void isIdenticalTree2BiggerTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(11);

        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(18);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(2);

        n2 = new TreeNode(7);
        n3 = new TreeNode(2);
        n4 = new TreeNode(6);
        n5 = new TreeNode(5);
        n6 = new TreeNode(11);

        n7 = new TreeNode(5);
        n8 = new TreeNode(9);
        n9 = new TreeNode(18);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Boolean expected = false;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }
}