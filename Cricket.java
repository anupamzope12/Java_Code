
public class Cricket extends Sport {
	private int NoPlayers;

	public Cricket() {

	}

	public Cricket(String name, int Noplayers) {
		super(name);
		this.NoPlayers = Noplayers;
	}

	@Override
	public void display() {
		System.out.println(" Name = " + super.name + " No.Players " + this.NoPlayers);
	}
	
	public void display1() {
		System.out.println("hello");
	}
}
