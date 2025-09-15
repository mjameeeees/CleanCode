package BehavioralPattern.IteratorPattern;

import java.util.Iterator;

public class BinaryTree <T extends Comparable<T>> implements Iterable<T> {
   private TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T val) {
        if (this.root == null) {
            this.root = new TreeNode<>(val);
        } else {
            this.root.insert(val);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new TreeIterator<>(root);
    }
}
