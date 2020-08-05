/*
判断平衡二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Test {
    public int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        return  left>right ? left+1:right+1;
    }
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root==null){
            return true;
        }
        int left=getHeight(root.left);
        int right=getHeight(root.right);
        if(Math.abs(left-right)>1){
            return false;
        }
        return isBalance(root.right)&&isBalance(root.left);
    }
}

