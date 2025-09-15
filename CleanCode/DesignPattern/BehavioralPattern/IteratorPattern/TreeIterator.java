package BehavioralPattern.IteratorPattern;

// File: TreeIterator.java
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class TreeIterator<T extends Comparable<T>> implements Iterator<T> {
    private Stack<TreeNode<T>> stack = new Stack<>();
    private TreeNode<T> current;

    public TreeIterator(TreeNode<T> root) {
        this.current = root;
        pushLeft(current);
    }

    private void pushLeft(TreeNode<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        TreeNode<T> node = stack.pop();
        T result = node.value;
        if (node.right != null) {
            pushLeft(node.right);
        }
        return result;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
