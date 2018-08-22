package day32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeIntersectionTest {

    @Test
    void emptyTreesTest() {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();

        boolean isNull = TreeIntersection.treeIntersection(tree1.root, tree2.root) == null;
        assertTrue(isNull);
    }

    @Test
    void tree1EmptyTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        TreeNode n1 = new TreeNode(8);

        TreeNode n2 = new TreeNode(7);

        TreeNode n3 = new TreeNode(2);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;

        n1.right = n3;

        String expected = "[]";
        String result = TreeIntersection.treeIntersection(tree1.root, tree2.root).toString();

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void tree2EmptyTest() {
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

        String expected = "[]";
        String result = TreeIntersection.treeIntersection(tree1.root, tree2.root).toString();

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void identicalWithDuplicateInTreeTest() {
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

        String expected = "[2, 18, 5, 6, 7, 9, 11]";
        String result = TreeIntersection.treeIntersection(tree1.root, tree2.root).toString();

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void whiteboardInputTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(150);

        TreeNode n2 = new TreeNode(100);
        TreeNode n3 = new TreeNode(75);
        TreeNode n4 = new TreeNode(160);
        TreeNode n5 = new TreeNode(125);
        TreeNode n6 = new TreeNode(175);

        TreeNode n7 = new TreeNode(250);
        TreeNode n11 = new TreeNode(200);
        TreeNode n8 = new TreeNode(350);
        TreeNode n9 = new TreeNode(300);
        TreeNode n12 = new TreeNode(500);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n7.left = n11;
        n8.left = n9;
        n8.right = n12;

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();
        n1 = new TreeNode(42);

        n2 = new TreeNode(100);
        n3 = new TreeNode(15);
        n4 = new TreeNode(160);
        n5 = new TreeNode(125);
        n6 = new TreeNode(175);

        n7 = new TreeNode(600);
        n11 = new TreeNode(200);
        n8 = new TreeNode(350);
        n9 = new TreeNode(4);
        n12 = new TreeNode(500);

        // Connect nodes
        tree2.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n7.left = n11;
        n8.left = n9;
        n8.right = n12;

        String expected = "[160, 100, 500, 200, 125, 350, 175]";
        String result = TreeIntersection.treeIntersection(tree1.root, tree2.root).toString();

        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}