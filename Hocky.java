
public class Hocky extends Sport {

	private int NoPlayers;

	public Hocky() {

	}

	public Hocky(String name, int NoPlayers) {
		super(name);
		this.NoPlayers = NoPlayers;
	}

	@Override
	public void display() {
		System.out.println("Name " + super.name + " NoPlayers " + this.NoPlayers);
	}
	
	public void display2()
	{
		System.out.println("Bye bye");
	}
}
