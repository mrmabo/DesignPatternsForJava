package Composite.example;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Component {
    private Collection<Component> list = new ArrayList<Component>();

    public Collection<Component> getList() {
        return list;
    }

    protected String title;

    public Component(String title) {
        this.title = title;
    }

    public abstract void print();
    public void addItem(Component item){
        list.add(item);
    }

}
