package kosa.a;

public class Work extends Man implements Speakable{

	public Work(String name) {
		super(name);
	}
	
	@Override
	public String speak() {
		return getName() + "열심히 일해야 한다";
		
	}
	
}
