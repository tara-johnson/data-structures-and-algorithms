package day18;

public class Main {
    public static void main(String[] args) {
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

//        FindMax.findMaximumValue(tree.root); // recursive

        FindMax.findMax(tree.root); // non-recursive
    }
}
