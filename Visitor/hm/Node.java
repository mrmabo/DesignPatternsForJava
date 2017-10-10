package Visitor.hm;

public class Node extends Root {

    private Root root;

    public Node(Root root, String name, String side) {
        super(name, side);
        this.root = root;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

}
