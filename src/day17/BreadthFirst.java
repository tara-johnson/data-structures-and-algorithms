package day17;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirst {
    public TreeNode root;

    public static void breadthFirstTraversal(TreeNode root) {
        // Create a queue to hold the tree nodes
        Queue<TreeNode> qq = new LinkedList<>();

        // Add the tree root to the queue
        qq.add(root);

        // If the queue is not empty
        // Poll the queue and save that node into a variable called temp
        // Print the polled node value
        // Add it's children to the queue
        while(!qq.isEmpty()){
            TreeNode temp = qq.poll();
            System.out.println("Visited node: " + temp);
            if (temp.left != null) {
                qq.add(temp.left);
            }
            if (temp.right != null) {
                qq.add(temp.right);
            }
        }
    }
}
