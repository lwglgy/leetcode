import java.util.HashMap;

public class Offer55 {
    HashMap<TreeNode,Integer> deep = new HashMap<>();
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        depth(root,1);
        return ans;

    }

    public int depth(TreeNode root,int deeplevel){
        if(root == null)return deeplevel-1;
        int ldeep = depth(root.left,deeplevel+1);
        int rdeep = depth(root.right,deeplevel+1);
        int level = Math.max(ldeep,rdeep);
        if(Math.abs(ldeep-rdeep) > 1 ) ans = false;
        return level;
    }
}
