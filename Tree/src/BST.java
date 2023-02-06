import java.util.*;

public class BST {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        TreeNode(int val) {
            this.val = val;
        }
    }
//    public TreeNode insertBST(TreeNode root, int val) {
//
//    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        if(root != null) {
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                list.add(node.val);
                if(node.right != null) {
                    stack.push(node.right);
                }
                if(node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return list;

    }
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode node = root;
        while (node != null) {
            if (node.val < val) {
                node = node.right;
            } else if (node.val > val) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }

}
