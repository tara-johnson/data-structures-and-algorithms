package day16;

public class FizzBuzzTree {
    public TreeNode root;

    public static void fizzBuzzMovement(TreeNode current) {
        if (current != null) {
            fizzBuzzMovement(current.left);
            fizzBuzzAction(current.data);
            fizzBuzzMovement(current.right);
        }
    }

    public static void fizzBuzzAction(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (value % 3 == 0) {
            System.out.println("Fizz");
        } else if (value % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(value);
        }
    }
}