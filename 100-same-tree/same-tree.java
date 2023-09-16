class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
      
        // If any of the conditions above is not met, it will reach this point and return false.
        return p == null && q == null;
    }
}
