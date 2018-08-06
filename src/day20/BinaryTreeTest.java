package day20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void flipEmptyTreeTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();

        System.out.println("Tree1 root: " + tree1.root);
        tree1.flip();

        boolean isNull = tree1.root == null;
        assertTrue(isNull);
    }

    @Test
    void flipTreeTest() {
        // Construct tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(8);

        TreeNode n2 = new TreeNode(2);

        TreeNode n7 = new TreeNode(6);
        TreeNode n8 = new TreeNode(7);
        TreeNode n9 = new TreeNode(1);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;

        n1.right = n7;
        n7.left = n8;
        n8.right = n9;

        // Node values before flip
        System.out.println("root.left before flip: " + tree1.root.left); // expect 2
        System.out.println("root.right before flip: " + tree1.root.right); // expect 6
        System.out.println("root.right.left before flip: " + tree1.root.right.left); // expect 7
        System.out.println("root.right.left.right before flip: " + tree1.root.right.left.right); // expect 1

        tree1.flip();

        // Node values after flip
        System.out.println("root.left after flip: " + tree1.root.left); // expect 6
        System.out.println("root.right after flip: " + tree1.root.right); // expect 2
        System.out.println("root.left.right after flip: " + tree1.root.left.right); // expect 7
        System.out.println("root.left.right.left after flip: " + tree1.root.left.right.left); // expect 1

        int rootLeftResult = 6;
        int rootLeftActual = tree1.root.left.data;
        System.out.println("root.left result: " + rootLeftResult);
        System.out.println("root.left actual: " + rootLeftActual);
        assertEquals(rootLeftResult, rootLeftActual);

        boolean rootRightLeftResult = tree1.root.right.left == null;
        assertTrue(rootRightLeftResult);

        int rootRightResult = 2;
        int rootRightActual = tree1.root.right.data;
        System.out.println("root.right result: " + rootRightResult);
        System.out.println("root.right actual: " + rootRightActual);
        assertEquals(rootRightResult, rootRightActual);

        int rootLeftRightResult = 7;
        int rootLeftRightActual = tree1.root.left.right.data;
        System.out.println("root.left.right result: " + rootLeftRightResult);
        System.out.println("root.left.right actual: " + rootLeftRightActual);
        assertEquals(rootLeftRightResult, rootLeftRightActual);

        int rootLeftRightLeftResult = 1;
        int rootLeftRightLeftActual = tree1.root.left.right.left.data;
        System.out.println("root.left.right.left result: " + rootLeftRightLeftResult);
        System.out.println("root.left.right.left actual: " + rootLeftRightLeftActual);
        assertEquals(rootLeftRightLeftResult, rootLeftRightLeftActual);
    }

    @Test
    void flipOneSidedTreeTest() {
        // Construct tree
        BinaryTree tree1 = new BinaryTree();
        TreeNode n1 = new TreeNode(8);

        TreeNode n2 = new TreeNode(2);

        // Connect nodes
        tree1.root = n1;

        n1.left = n2;


        // Node values before flip
        System.out.println("root.left before flip: " + tree1.root.left); // expect 2
        System.out.println("root.right before flip: " + tree1.root.right); // expect null

        tree1.flip();

        // Node values after flip
        System.out.println("root.left after flip: " + tree1.root.left); // expect null
        System.out.println("root.right after flip: " + tree1.root.right); // expect 2

        boolean rootLeftResult = tree1.root.left == null;
        System.out.println("root.left result: " + rootLeftResult);
        assertTrue(rootLeftResult);

        int rootRightResult = 2;
        int rootRightActual = tree1.root.right.data;
        System.out.println("root.right result: " + rootRightResult);
        System.out.println("root.right actual: " + rootRightActual);
        assertEquals(rootRightResult, rootRightActual);
    }
}