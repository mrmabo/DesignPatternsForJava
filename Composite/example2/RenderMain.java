package Composite.example2;

public class RenderMain {
	public static void main(String[] args) {

		ComponentRender root = null;
		String name = "HTML";
		root = new CompositeRender(name);
		ComponentRender leaf1 = new CompositeRender("<HEAD><TITLE>Your Title Here</TITLE></HEAD>");
		ComponentRender leaf2 = new CompositeRender("<BODY>");
		ComponentRender leaf21 = new CompositeRender("<Center>");
		ComponentRender leaf22 = new CompositeRender("<H1>");
		ComponentRender leaf23 = new CompositeRender("<H2>");

		//Create a tree
		root.addChildren(leaf1);
		leaf2.addChildren(leaf21);
		leaf2.addChildren(leaf22);
		leaf2.addChildren(leaf23);
		root.addChildren(leaf2);
		
		//remove a tree node
		root.removeChildren(leaf22);

		root.printNode();
	}

}
