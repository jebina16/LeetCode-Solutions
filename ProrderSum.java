import java.util.Scanner;
public class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class PreorderSum{
    static Scanner sc=new Scanner(System.in);
    static TreeNode buildtree(){
    int val=sc.nextInt();
    if(val==-1)return null;
    TreeNode root=new TreeNode(val);
    root.left=buildtree();
    root.right=buildtree();
    }
    static TreeNode preorder(TreeNode root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[]args){
        TreeNode root=buildtree();
        preorder(root);
    }
}