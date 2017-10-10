package Decorator.hm1;

import java.util.List;

public class DecoratorTest {
	public static void main(String[] args) {
		Employee e1=new Employee("John");
		Employee e2=new Employee("Tom");
		Employee e3=new Employee("David");
		
		List<Employee> arraylist=new DecoratorArrayList();
		List<Employee> linkedlist=new DecoratorLinkedList();
		
		System.out.print("            ");
		System.out.print("ArrayList         ");
		System.out.print("LinkedList        ");
		System.out.println("");
		//add
		long startTime = System.nanoTime();
		arraylist.add(e1);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.print("boolean add(E e)"+"     ");
		System.out.print(duration+"milliseconds     ");
		long startTime1 = System.nanoTime();
		linkedlist.add(e1);
		long endTime1 = System.nanoTime();
		long duration1 = (endTime1 - startTime1);
		System.out.print(duration1+"milliseconds     ");
		System.out.println("");
		//remove
        long startTime2 = System.nanoTime();
		arraylist.remove(e1);
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2);
		System.out.print("boolean remove(Object o)"+"     ");
		System.out.print(duration2+"milliseconds     ");
		long startTime3 = System.nanoTime();
		linkedlist.remove(e1);
		long endTime3 = System.nanoTime();
		long duration3 = (endTime3 - startTime3);
		System.out.print(duration3+"milliseconds     ");
		System.out.println("");
		//boolean contains(Object o)
		arraylist.add(e1);
		linkedlist.add(e1);
		
        long startTime4 = System.nanoTime();
		arraylist.contains(e1);
		long endTime4 = System.nanoTime();
		long duration4 = (endTime4 - startTime4);
		System.out.print("boolean contains(Object o)"+"     ");
		System.out.print(duration4+"milliseconds     ");
		long startTime5 = System.nanoTime();
		linkedlist.contains(e1);
		long endTime5 = System.nanoTime();
		long duration5 = (endTime5 - startTime5);
		System.out.print(duration5+"milliseconds     ");
		System.out.println("");
		//int size() 	
        long startTime6 = System.nanoTime();
		arraylist.size();
		long endTime6 = System.nanoTime();
		long duration6 = (endTime6 - startTime6);
		System.out.print("int size()"+"     ");
		System.out.print(duration6+"milliseconds     ");
		long startTime7 = System.nanoTime();
		linkedlist.size();
		long endTime7 = System.nanoTime();
		long duration7 = (endTime7 - startTime7);
		System.out.print(duration7+"milliseconds     ");
		
	}
}
