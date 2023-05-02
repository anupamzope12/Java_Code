import java.util.Scanner;

public class TesterSport {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------");
		Sport sp = new Sport("Sport");
		sp.display();

		System.out.println("------");

		Cricket ck = new Cricket("Cricket", 11);
		ck.display();

		System.out.println("------");
		Hocky hk = new Hocky("Hocky", 11);
		hk.display();
		
		System.out.println("------");
		System.out.println("UpCasting");
		
		Sport spr=new Cricket("VollyBall",9);
		spr.display();
		
		System.out.println("------");
		
		Sport sp1=new Hocky("Hockey",11);
		sp1.display();		
		
		System.out.println("-----------");
		System.out.println("DownCasting");
		
		//why down casting to call any specific method of child class via parent 
		
		
		
		Sport s =new Cricket("sport",12);  //upcast
		((Cricket)s).display1();  //downcast
		
		Sport s1=new Hocky("Hocky",9);
		((Hocky)s1).display2();
		
	}
}
