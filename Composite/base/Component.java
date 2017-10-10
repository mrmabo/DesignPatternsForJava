package Composite.base;

public abstract class Component {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);

    public abstract void display(int depth);

}
