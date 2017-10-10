package Decorator.hm1;

import java.util.ArrayList;

public class DecoratorArrayList<E> extends ArrayList<E> {
	
	private static final long serialVersionUID = 1L;

//	public DecoratorArrayList(List<E> arraylist){
//		super(arraylist);
//	}
	
	public int size() {
		return super.size();
	}

	public boolean add(E e) {
		return super.add(e);
	}

	public boolean remove(Object o) {
		return super.remove(o);
	}
	
	public boolean contains(Object o){
		return super.contains(o);
	}
	

}
