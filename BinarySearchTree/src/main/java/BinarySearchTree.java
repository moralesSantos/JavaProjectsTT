
import java.util.Comparator;

public class BinarySearchTree<E> {
    protected BinarySearchTree<E> root = null;

    private Comparator<E> comparator;

    public BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(Comparator<E> c) {
        comparator = c;
    }

    public boolean contains(E data) {
        return nodeContaining(data) != null;
    }

    public void add(E data) {
        if (root ==null){
            root = new LinkedBinaryTreeNode<E>(data);
        }
        BinaryTreeNode<E> n =  root;
        while(true){
            int comparisonResult = compare(data, n.getData());

        }
    }


}
