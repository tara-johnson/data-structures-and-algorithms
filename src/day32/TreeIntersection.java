package day32;

import java.util.*;

public class TreeIntersection {

    public static Set treeIntersection(TreeNode root1, TreeNode root2) {
        // Create hash sets to hold the tree node values
        Set<Integer> ss1 = new HashSet<>();
        Set<Integer> ss2 = new HashSet<>();

        // Create queues to hold the tree nodes during traversal
        Queue<TreeNode> qq1 = new LinkedList<>();
        Queue<TreeNode> qq2 = new LinkedList<>();

        // Add respective tree roots to the queues
        qq1.add(root1);
        qq2.add(root2);

        // If both queues are empty return null
        if (qq1.peek() == null && qq2.peek() == null) {
            return null;
        }

        // If the queues are not empty
        // Poll the queues and save the nodes into variables
        // temp1 (for qq1) and temp2 (for qq2)
        while (!qq1.isEmpty() && !qq2.isEmpty()) {
            TreeNode temp1 = qq1.poll();
            TreeNode temp2 = qq2.poll();

            // Add node values to HashSets
            // temp1 to ss1 and temp2 to ss2
            if (temp1 != null) {
                ss1.add(temp1.data);
            }

            if (temp2 != null) {
                ss2.add(temp2.data);
            }

            // Add each trees children to their respective queues
            try {
                if (temp1.left != null) {
                    qq1.add(temp1.left);
                }

                if (temp1.right != null) {
                    qq1.add(temp1.right);
                }

                if (temp2.left != null) {
                    qq2.add(temp2.left);
                }

                if (temp2.right != null) {
                    qq2.add(temp2.right);
                }
            } catch (NullPointerException e) {
                System.out.println("Caught null pointer exception");
            }
        }

        System.out.println("ss1 before retailAll: " + ss1);
        System.out.println("ss2 before retailAll: " + ss2);

        // True if set changed after retailAll
        boolean changedSet = ss1.retainAll(ss2);
        System.out.println(changedSet);

        System.out.println("ss1 after retainAll: " + ss1);
        System.out.println("ss2 after retainAll: " + ss2);

        return ss1;
    }
}
