//upcatsing

public class Sport {

	protected String name;

	public Sport() {
		System.out.println("Default Constr");
	}

	public Sport(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Name = " + name);
	}
	
}
