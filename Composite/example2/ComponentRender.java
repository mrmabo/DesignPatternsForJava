package Composite.example2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

public abstract class ComponentRender {
	public String name;
	public ComponentRender parent;

	private Collection<ComponentRender> list = new ArrayList<ComponentRender>();

	public Collection<ComponentRender> getList() {
		return list;
	}

	public void addChildren(ComponentRender node){
        list.add(node);
    };
	public void removeChildren(ComponentRender node){
	    list.remove(node);
    };

	public abstract void printNode();
	
	public ComponentRender(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ComponentRender getParent() {
		return parent;
	}
	public void setParent(ComponentRender parent) {
		this.parent = parent;
	}
	
}
