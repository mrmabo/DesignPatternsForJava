package Prototype.example;

public class Person implements Prototype {
	String name;
	Supervisor supervisor;

	
	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Prototype doClone() {
		// TODO Auto-generated method stub
		return new Person(name);
	}

	public String toString() {
		return name;
	}

}
