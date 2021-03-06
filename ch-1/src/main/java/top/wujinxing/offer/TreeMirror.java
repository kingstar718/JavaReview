package top.wujinxing.offer;

/**
 * @author: wujinxing
 * @date: 2019/4/3 10:44
 * @description: 操作给定的二叉树，将其变换为源二叉树的镜像。
 *           8
 *     	   /  \
 *     	  6   10
 *     	 / \  / \
 *     	5  7 9 11
 *     	镜像二叉树
 *     	     8
 *     	   /  \
 *     	  10   6
 *     	 / \  / \
 *     	11 9 7  5
 */
public class TreeMirror {
    public void Mirror(TreeNode root) {
        TreeNode tmp = null;
        if(root != null){
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            if(root.left != null)
                Mirror(root.left);
            if(root.right != null)
                Mirror(root.right);
        }
    }

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
}
