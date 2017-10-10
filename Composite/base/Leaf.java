package Composite.base;

public class Leaf  extends Component{

    private String name;

    public Leaf(String name) {
        super();
        this.name = name;
    }

    @Override
    public void add(Component c) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println("-"+depth + name);
    }
}
