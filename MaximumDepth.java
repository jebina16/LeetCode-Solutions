import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
class MaximumDepth{
static Scanner sc=new Scanner(System.in);
public int maxDepth(TreeNode root){
    if(root==null)return 0;
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    return 1+Math.max(left,right);
}
public static TreeNode createTree()
{
 int val=sc.nextInt();
 if(val==-1)return null;
 TreeNode root=new TreeNode(val,null,null);
 root.left=createTree();
 root.right=createTree();
  return root;
}
public static void main(String[]args){
TreeNode root=createTree();
 MaximumDepth obj = new MaximumDepth();
System.out.print("maximun depth"+obj.maxDepth(root));
}
}