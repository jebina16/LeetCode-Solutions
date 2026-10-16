import java.util.Scanner;
class TreeNode{
    int val;
    PreorderSum left;
    PreorderSum right;
    TreeNode(int val,PreorderSum left,PreorderSum right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
class MaximumDepth{
static Scanner sc=new Scanner(System.in);
public int maxDepth(PreorderSum root){
    if(root==null)return 0;
    int left=maxDepth(root.left);
    int right=maxDepth(root.right);
    return 1+Math.max(left,right);
}
public static PreorderSum createTree()
{
 int val=sc.nextInt();
 if(val==-1)return null;
 PreorderSum root=new PreorderSum(val,null,null);
 root.left=createTree();
 root.right=createTree();
  return root;
}
public static void main(String[]args){
PreorderSum root=createTree();
 MaximumDepth obj = new MaximumDepth();
System.out.print("maximun depth"+obj.maxDepth(root));
}
}