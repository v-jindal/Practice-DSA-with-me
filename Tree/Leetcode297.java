public class Leetcode297 {
    static int index = 0;
    static StringBuilder sb;
    static String arr[];
    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        sb = new StringBuilder();
        helper(root);
        return sb.toString();
    }
    public static void helper(TreeNode root){
        if(root == null){
            sb.append("null").append(" ");
            return;
        }
        sb.append(root.val).append(" ");
        helper(root.left);
        helper(root.right);           
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        data = data.trim();
        index = 0;
        arr = data.split("\\s+");
        return help(arr);
    }
    public static TreeNode help(String[] arr){ 
        if(index == arr.length) return null;
        if(arr[index].equals("null")){
            index++;
            return null;
        }
        int v = Integer.parseInt(arr[index++]);
        TreeNode t = new TreeNode(v);
        t.left = help(arr);
        t.right = help(arr);
        return t;
    }
    public static void printTree(TreeNode root){
        if(root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String s = serialize(root);
        System.out.println(s);
        TreeNode t = deserialize(s);
        printTree(t);
    }
}
