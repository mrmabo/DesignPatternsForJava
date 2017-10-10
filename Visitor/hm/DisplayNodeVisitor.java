package Visitor.hm;

public class DisplayNodeVisitor implements NodeVisitor {

    private String side;
    private String name;

    @Override
    public void Visitor(Root root) {
        this.name = root.getName();
        this.side = root.getSide();
    }

    @Override
    public void Visitor(Node node) {
        this.name = node.getName();
        this.side = node.getSide();
    }

}
