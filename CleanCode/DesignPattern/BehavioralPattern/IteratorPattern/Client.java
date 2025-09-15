package BehavioralPattern.IteratorPattern;

public class Client {
        public static void main(String[] args) {
        BinaryTree<Integer> bst = new BinaryTree<>();
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(4);
        bst.insert(7);
        bst.insert(14);
        bst.insert(13);

        System.out.println("In-order traversal of BST:");
        for (Integer val : bst) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
   
}
