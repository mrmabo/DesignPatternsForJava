package Visitor.hm;

import java.util.ArrayList;
import java.util.List;

public class Root {
    String side;
    String name;
    private List<Node> children = new ArrayList<Node>();


    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Root(String name, String side) {
        this.name = name;
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
