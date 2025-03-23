class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

}

public class Representation {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5) ;

        root.left = new TreeNode(4) ;
        root.right = new TreeNode(6) ;

        root.left.left = new TreeNode(3) ;
    }
}
