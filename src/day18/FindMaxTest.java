package day18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMaxEmptyTreeTest() {
        FindMax tree = new FindMax();

        Integer result = 0;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxSingleNodeTest() {
        FindMax tree = new FindMax();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(2);

        // Connect nodes
        tree.root = n1;

        n1.left = n2;

        Integer result = 2;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxRootTest() {
        FindMax tree = new FindMax();
        TreeNode n1 = new TreeNode(237);

        TreeNode n2 = new TreeNode(212);
        TreeNode n3 = new TreeNode(197);
        TreeNode n4 = new TreeNode(194);
        TreeNode n5 = new TreeNode(171);
        TreeNode n6 = new TreeNode(195);

        TreeNode n7 = new TreeNode(101);
        TreeNode n8 = new TreeNode(117);
        TreeNode n9 = new TreeNode(191);

        // Connect nodes
        tree.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Integer result = 237;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxMiddleNodeTest() {
        FindMax tree = new FindMax();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(7);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(6);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(11);

        TreeNode n7 = new TreeNode(5);
        TreeNode n8 = new TreeNode(9);
        TreeNode n9 = new TreeNode(4);

        // Connect nodes
        tree.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Integer result = 11;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxLastNodeTest() {
        FindMax tree = new FindMax();
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
        tree.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Integer result = 18;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxSameValuesTest() {
        FindMax tree = new FindMax();
        TreeNode n1 = new TreeNode(2);

        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(2);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(2);

        TreeNode n7 = new TreeNode(2);
        TreeNode n8 = new TreeNode(2);
        TreeNode n9 = new TreeNode(2);

        // Connect nodes
        tree.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Integer result = 2;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }

    @Test
    void findMaxNegativeValuesTest() {
        FindMax tree = new FindMax();
        TreeNode n1 = new TreeNode(-2);

        TreeNode n2 = new TreeNode(-7);
        TreeNode n3 = new TreeNode(-2);
        TreeNode n4 = new TreeNode(-6);
        TreeNode n5 = new TreeNode(-5);
        TreeNode n6 = new TreeNode(-11);

        TreeNode n7 = new TreeNode(-5);
        TreeNode n8 = new TreeNode(-9);
        TreeNode n9 = new TreeNode(-18);

        // Connect nodes
        tree.root = n1;

        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        n4.left = n5;
        n4.right = n6;

        n1.right = n7;
        n7.right = n8;
        n8.left = n9;

        Integer result = -2;
        Integer expected = FindMax.findMax(tree.root);

        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);

        assertEquals(result, expected);
    }
}