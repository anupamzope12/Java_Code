package Self.Hashing.LinkedHash;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[]args)
	{
		
	LinkedList <Integer> lkhs1=new LinkedList <> (); // Implementing HashSet  
	
	lkhs1.add(10);
	lkhs1.add(20);
	lkhs1.add(30);
	lkhs1.add(40);
	lkhs1.add(50);
	lkhs1.add(50);
	lkhs1.add(60);
	
	System.out.println(lkhs1);
	
	System.out.println("-------------");
	Iterator <Integer> itr = lkhs1.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	System.out.println("=============");
	
	Integer i1=new Integer(50);		//out dated not used nowdays
	System.out.println(i1);
	
	System.out.println("=============");

	Integer i2;
	i2=80;
	
	System.out.println(i2);
	
	}
}