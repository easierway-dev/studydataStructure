/**
 * @author jianjilong
 * @email 2594979588@qq.com
 * @date 2021/6/22 11:06
 */
public class RBTreeNode<T extends Comparable<T>> {

    // 节点值
    private T value;
    // 左节点
    private RBTreeNode<T> left;
    // 右节点
    private RBTreeNode<T> right;
    // 父节点
    private RBTreeNode<T> parent;
    // color is red or not red
    private boolean red;
    public RBTreeNode(){}
    public RBTreeNode(T value){this.value=value;}
    public RBTreeNode(T value, boolean isRed) {
        this.value = value;
        this.red = isRed;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public RBTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(RBTreeNode<T> left) {
        this.left = left;
    }

    public RBTreeNode<T> getRight() {
        return right;
    }

    public void setRight(RBTreeNode<T> right) {
        this.right = right;
    }

    public RBTreeNode<T> getParent() {
        return parent;
    }

    public void setParent(RBTreeNode<T> parent) {
        this.parent = parent;
    }

    public boolean isRed() {
        return red;
    }
    public boolean isBlack() {
        return !red;
    }
    /**
     * is left node
     */
    boolean isLeaf(){
        return left==null && right==null;
    }

    void setRed(boolean red) {
        this.red = red;
    }

    void makeRed(){
        red=true;
    }
    void makeBlack(){
        red=false;
    }
    @Override
    public String toString(){
        return value.toString();
    }
}
