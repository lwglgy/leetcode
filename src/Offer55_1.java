public class Offer55_1 {
    public int maxDepth(TreeNode root) {
        return depth(root,1);
    }

    public int depth(TreeNode root, int deepth){
        if(root == null)return deepth-1;
        return Math.max(depth(root.right,deepth+1),depth(root.left,deepth+1));
    }

}
