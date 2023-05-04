package Self.Hashing.LinkedHash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 {
	public static void main(String[]args)
	{
		LinkedHashSet <String> lhs=new LinkedHashSet<>();
		
		String [] str= {"Anupam","Shyam","Ram","Aniket","Sonu"};
		
//		System.out.println(lhs.add(str));
		
		for(String s:str)
			System.out.println(lhs.add(s));
		
		System.out.println(" ");
		System.out.println("=================");
		System.out.println(" ");
		
		Iterator <String> itr = lhs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
	//display these names in desc manner (lexicographic : desc)
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
