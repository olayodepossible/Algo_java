package com.possible.coding;

public class BST {
    public static Integer findMinGreaterThan(TreeNode root, int number) {
        TreeNode current = root;
        Integer result = null;

        while (current != null) {
            if (current.val > number) {
                result = current.val;
                current = current.left;
            } else {
                current = current.right;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        int number = 7;
        Integer result = findMinGreaterThan(root, number);
        if (result != null) {
            System.out.println("Minimum number greater than " + number + " is " + result);
        } else {
            System.out.println("No number greater than " + number + " found in the tree.");
        }
    }
}

