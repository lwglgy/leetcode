import java.util.ArrayList;
import java.util.LinkedList;

public class Offer32 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int[] levelOrder(TreeNode root) {
        if(root == null)return new int[]{};
        ArrayList<Integer> ans = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.pop();
            ans.add(temp.val);
            if(temp.left!=null)queue.addLast(temp.left);
            if(temp.right!=null)queue.addLast(temp.right);
        }
        int size = ans.size();
        int[] ansarr = new int[size];
        int index = 0;
        for(Integer x:ans){
            ansarr[index++] = x;
        }
        return ansarr;
    }
}
