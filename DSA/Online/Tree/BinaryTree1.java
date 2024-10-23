package Online.Tree;

import java.util.Scanner;

public class BinaryTree1 {

    class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.data = data;
        }
    }

    private Tree root;
    private Scanner sc = new Scanner(System.in);

    public BinaryTree1() {
        root = createTree();
    }

    private Tree createTree() {
        int data = sc.nextInt();
        Tree tree = new Tree(data);

        boolean hasLeftChild = sc.nextBoolean();
        if (hasLeftChild) {
            tree.left = createTree();
        }

        boolean hasRightChild = sc.nextBoolean();
        if (hasRightChild) {
            tree.right = createTree();
        }

        return tree;
    }

    public void display() {
        display(root);
    }

    private void display(Tree tree) {
        if (tree == null) {
            return;
        }

        String s = "";
        s = "<--" + tree.data + "-->";
        if (tree.left != null) {
            s = tree.left.data + s;
        } else {
            s = "." + s;
        }
        if (tree.right != null) {
            s = s + tree.right.data;
        } else {
            s = s + ".";
        }

        System.out.println(s);

        display(tree.left);
        display(tree.right);
    }

    public static void main(String[] args) {
        BinaryTree1 bt = new BinaryTree1();
                // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
        bt.display(); 
    }
}
