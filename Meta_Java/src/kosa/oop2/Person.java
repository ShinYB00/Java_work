package kosa.oop2;

public class Person {

	private String name;
	private Role role;
	
	public Person() {}

	public Person(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}
	
	public void doIt() {
		role.doing();
	}
	
}
