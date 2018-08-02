package day18;

import java.util.LinkedList;
import java.util.Queue;

public class FindMax {
    public TreeNode root;

      // Recursive solution
//    public static int findMaximumValue(TreeNode current) {
//
//        int maxValue = 0;
//
//        System.out.println(" ");
//        System.out.println("---------- Start function ----------");
//        System.out.println(" ");
//
//        System.out.println("Current value: " + current);
//        if (current != null) {
//
//            int startValue = current.data;
//            System.out.println("Start value: " + startValue);
//
//            int maxLeft = findMaximumValue(current.left);
//            System.out.println("Left value: " + current.left);
//
//            int maxRight = findMaximumValue(current.right);
//            System.out.println("Right value: " + current.right);
//
//            if (maxLeft > maxRight) {
//                maxValue = maxLeft;
//            } else {
//                maxValue = maxRight;
//            }
//
//            if (startValue > maxValue) {
//                maxValue = startValue;
//            }
//        }
//        System.out.println("maxValue: " + maxValue);
//
//        System.out.println(" ");
//        System.out.println("---------- End function ----------");
//        System.out.println(" ");
//
//        return maxValue;
//    }

    // Non-recursive solution
    public static int findMax(TreeNode root) {
        // Create a queue to hold the tree nodes
        Queue<TreeNode> qq = new LinkedList<>();

        if (root == null) {
            System.out.println("The tree is empty");
            return 0;
        }

        // Add the tree root to the queue
        qq.add(root);

        int maxValue = root.data;
        System.out.println("Starting maximum value: " + maxValue);

        // If the queue is not empty
        // Poll the queue and save that node into a variable called temp
        // Compare the value of temp with the value of current maximum value
        // Whichever is greater is the current maximum value
        // Add the removed node's children to the queue
        while(!qq.isEmpty()){
            TreeNode temp = qq.poll();
            if (temp.data > maxValue) {
                maxValue = temp.data;
            }
            System.out.println("Visited node: " + temp);
            System.out.println("Current maximum Value: " + maxValue);
            if (temp.left != null) {
                qq.add(temp.left);
            }
            if (temp.right != null) {
                qq.add(temp.right);
            }
        }
        System.out.println("Final maximum value: " + maxValue);
        return maxValue;
    }
}
