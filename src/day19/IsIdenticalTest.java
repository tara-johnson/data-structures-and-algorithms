package day19;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsIdenticalTest {

    @Test
    void isIdenticalEmptyTreeTest() {
        // Construct first tree
        BinaryTree tree1 = new BinaryTree();

        // Construct second tree
        BinaryTree tree2 = new BinaryTree();

        Boolean expected = true;
        Boolean actual = tree1.isIdentical(tree2);

        assertEquals(expected, actual);
    }

//    @Test
//    void isIdenticalTreeTest() {
//        // Construct first tree
//        BinaryTree tree1 = new BinaryTree();
//        TreeNode n1 = new TreeNode(2);
//
//        TreeNode n2 = new TreeNode(7);
//        TreeNode n3 = new TreeNode(2);
//        TreeNode n4 = new TreeNode(6);
//        TreeNode n5 = new TreeNode(5);
//        TreeNode n6 = new TreeNode(11);
//
//        TreeNode n7 = new TreeNode(5);
//        TreeNode n8 = new TreeNode(9);
//        TreeNode n9 = new TreeNode(18);
//
//        // Connect nodes
//        tree1.root = n1;
//        System.out.println("Tree 1 root: " + tree1.root);
//
//        n1.left = n2;
//        n2.left = n3;
//        n2.right = n4;
//        n4.left = n5;
//        n4.right = n6;
//
//        n1.right = n7;
//        n7.right = n8;
//        n8.left = n9;
//
//        // Construct second tree
//        BinaryTree tree2 = new BinaryTree();
//        TreeNode nn1 = new TreeNode(3);
//
//        TreeNode nn2 = new TreeNode(7);
//        TreeNode nn3 = new TreeNode(2);
//        TreeNode nn4 = new TreeNode(6);
//        TreeNode nn5 = new TreeNode(5);
//        TreeNode nn6 = new TreeNode(11);
//
//        TreeNode nn7 = new TreeNode(5);
//        TreeNode nn8 = new TreeNode(9);
//        TreeNode nn9 = new TreeNode(18);
//
//        // Connect nodes
//        tree2.root = nn1;
//        System.out.println("Tree 2 root: " + tree2.root);
//
//        nn1.left = nn2;
//        nn2.left = nn3;
//        nn2.right = nn4;
//        nn4.left = nn5;
//        nn4.right = nn6;
//
//        nn1.right = nn7;
//        nn7.right = nn8;
//        nn8.left = nn9;
//
//        BinaryTree.compareTrees(tree1.root, tree2.root);
//
//        tree1.isIdentical(tree2);

//        Boolean expected = tree1.isIdentical(tree2);
//        System.out.println("Expected: " + expected);


//        Boolean result = true;
//        Boolean expected = tree1.isIdentical(tree2.root);
//
//        System.out.println("Result: " + result);
//        System.out.println("Expected: " + expected);
//
//        assertEquals(result, expected);
//    }
}