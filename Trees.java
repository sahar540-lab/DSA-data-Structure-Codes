class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null; 
}
}
public class BinaryTree {
    Node root;
    void insert() {
        root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50); 
    }
    boolean search(Node root, int key) {
        if (root == null) {
            return false; 
        }
        if (root.data == key) {
            return true;
        }
        return search(root.left, key) || search(root.right, key);
    }
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
  void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
  }
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " "); 
        } 
    }
 public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert();
        System.out.println("Inorder:");
        tree.inorder(tree.root);
        System.out.println("\nPreorder:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder:");
        tree.postorder(tree.root);
        int key = 50;
        if (tree.search(tree.root, key)) {
            System.out.println("\nElement Found");
        } else {
            System.out.println("\nElement Not Found"); 
        } 
        } 
        }
  






