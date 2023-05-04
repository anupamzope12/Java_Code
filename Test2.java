package Self.Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
	public static void main(String[]args)
	{
		HashSet <String> hs1=new HashSet<>();
		
		hs1.add("Anupam");
		hs1.add("Aniket");
		hs1.add("Saurabh");
		hs1.add("Rohit");
		hs1.add("Sushant");
		hs1.add("Prashant");
		hs1.add("Pravin");
		
		System.out.println("Display all String");
		
		// for each loop
		
		for(String a:hs1)
		{
			System.out.println(hs1);
		}
		
		System.out.println("=========");
		
		//forloop
		
		for(int i=0 ; i<hs1.size(); i++)
		{
			System.out.println(hs1);
		}
		
		System.out.println("------------");
		
		System.out.println(hs1);
		
		//Using Iterator
		
		System.out.println("=========");
		
		System.out.println("Using Iterator");
		
		Iterator <String> itr1=hs1.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
	}

}
