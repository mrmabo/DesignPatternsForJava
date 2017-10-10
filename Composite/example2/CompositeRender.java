package Composite.example2;

import java.util.Enumeration;

public class CompositeRender extends ComponentRender {
	
	public CompositeRender(String name){
		super(name);
	}

	@Override
	public void printNode() {
		System.out.println(name);
		for (ComponentRender item : super.getList()){
            item.printNode();
        }
	}

}
