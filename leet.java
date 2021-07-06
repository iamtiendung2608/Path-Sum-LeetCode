
//   Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
class Solution {
    Boolean result=false;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        FindPath(root, targetSum, 0);
        return result;
    }
    public void FindPath(TreeNode root, int target, int current){
        if(root.left==null&&root.right==null){
            if(current==target)
                result=true;
            current-=root.val;
            return ;
        }
        current+=root.val;
        if(root.left==null)
            FindPath(root.right, target, current);  
        if(root.right==null)
            FindPath(root.left, target, current);
        else{
            FindPath(root.left, target, current);
            FindPath(root.right, target, current);
        }
        return ;
    }
}