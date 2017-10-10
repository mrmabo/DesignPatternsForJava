package Prototype.example;

import java.io.IOException;

public class PrototypeTest {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Supervisor supervisor1=new Supervisor("supervisor1");
		Person p1 = new Person("Lin chen");
		p1.setSupervisor(supervisor1);
		
		System.out.println("p1 supervisor "+p1.supervisor.getName());

		Person p2 = (Person) p1.doClone();
		Supervisor supervisor2=new Supervisor("supervisor2");
		p2.setSupervisor(supervisor2);
		System.out.println("p2 supervisor "+p2.supervisor.getName());
		System.out.println("p1 supervisor "+p1.supervisor.getName() +" after clone()");

//		System.out.println(p1.equals(p2));

		Employee e1 = new Employee();
		e1.setFirstname("Lin");
		e1.setSupervisors(supervisor1);
		System.out.println("e1 supervisor "+e1.supervisors.getName());

		Employee e2 = (Employee) e1.deepClone();
		e2.setSupervisors(supervisor2);
		System.out.println("e2 supervisor "+e2.supervisors.getName());
		System.out.println("e1 supervisor "+e1.supervisors.getName()+" after clone()");

//		System.out.println(e1.equals(e2));

	}
}
