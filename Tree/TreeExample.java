import java.util.Scanner;
class TreeNode1<T> { //<T> indicates datatype is not known
    T data;
    TreeNode1<T> left;
    TreeNode1<T> right;
    TreeNode1(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeExample{
    static Scanner scan = new Scanner(System.in);
    static TreeNode1<Integer> buildTree(){
        System.out.println("Enter the data of the node: ");
        int data =  scan.nextInt();
        if(data == -1) return null;
        TreeNode1<Integer> root = new TreeNode1<>(data);
        System.out.println("Enter the left child of "+data);
        root.left = buildTree();
        System.out.println("Enter the right child of "+data);
        root.right = buildTree();
        return root;
    }
    static void preOrder(TreeNode1<Integer> root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }       
    static void inOrder(TreeNode1<Integer> root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(TreeNode1<Integer> root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        TreeNode1<Integer> root = buildTree();
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}