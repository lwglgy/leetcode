import java.util.HashMap;

public class Offer07 {
    //函数思路：这个函数需要实现什么
    //1.函数出口
    //2.函数参数  a 根节点   b 中序的左树范围    c 中序中的右树范围
    //3.实现功能   a 创建当前节点，左节点为递归做前序，右子树为递归前序数组范围 前序中根的右边一位就是下一个的根节点（重点是知道左子树和右子树的长度？？左右子树的长度依靠中序遍历给出）
    //4.
    HashMap<Integer,Integer> dict;
    int[] preorder;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        dict = new HashMap<>();
        this.preorder = preorder;
        int n = preorder.length;
        for(int i=0;i<n;i++){
            dict.put(inorder[i],i);
        }
        return build(0,0,n-1);
    }
    private TreeNode build(int root,int left,int right){
        if(left == right){
            return new TreeNode(preorder[root]);
        }
        if(left<right){
            TreeNode node = new TreeNode(preorder[root]);
            int index = dict.get(preorder[root]);
            node.left = build(root+1,left,index-1);
            node.right = build(root+index+1-left,index+1,right);
            return node;
        }
        return null;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
