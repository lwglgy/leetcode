public class Offer54 {
    int ans = -1;
    int index;
    public int kthLargest(TreeNode root, int k) {
        index = k;
        mid(root);
        return ans;

    }

    public void mid(TreeNode root){
        if(ans != -1)return ;
        if(root == null) return ;
        mid(root.right);
        index--;
        if(index == 0)ans = root.val;
        mid(root.left);
    }

}
