import java.util.Scanner;

class TreeNode<T> { //<T> indicates datatype is not known
    T data;
    TreeNode<T> left;
    TreeNode<T> right;
    TreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class TreeExample{
    static Scanner scan = new Scanner(System.in);
    static TreeNode<Integer> buildTree(){
        System.out.println("Enter the data of the node: ");
        int data =  scan.nextInt();
        if(data == -1) return null;
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter the left child of "+data);
        root.left = buildTree();
        System.out.println("Enter the right child of "+data);
        root.right = buildTree();
        return root;
    }
    // Preorder Traversal
    static void preOrder(TreeNode<Integer> root){
        if(root == null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Inorder Traversal
    static void inOrder(TreeNode<Integer> root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // Postorder Traversal
    static void postOrder(TreeNode<Integer> root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = buildTree();
        preOrder(root);
    }
}