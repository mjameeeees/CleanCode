package BehavioralPattern.IteratorPattern;

public class TreeNode <T extends Comparable<T>> {
    T value;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode(T val){
        this.value = val;
        this.left = null;
        this.right = null;
    }

       public void insert(T val) {
        if (val.compareTo(this.value) < 0) {
            if (left == null) {
                left = new TreeNode<>(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new TreeNode<>(val);
            } else {
                right.insert(val);
            }
        }
    }
}
