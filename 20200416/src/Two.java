/*
https://www.nowcoder.com/questionTerminal/564f4c26aa584921bc75623e48ca3011
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Two {
    TreeNode node=null;
    public void Mirror(TreeNode root) {
        if(root==null){
            return;
        }
        node=root.left;
        root.left=root.right;
        root.right=node;
        Mirror(root.left);
        Mirror(root.right);
    }
}
