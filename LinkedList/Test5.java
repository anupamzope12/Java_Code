package Self.Hashing.LinkedHash;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Test5 {
	public static void main(String[]args)
	{
//		LinkedHashSet <String> lhs=new LinkedHashSet<>();
		TreeSet<String> hs=new TreeSet<>();

		String [] str= {"Anupam","Shyam","Ram","Aniket","Sonu"};
		
		for(String s:str)
			System.out.println(hs.add(s));
		
		System.out.println(" ");
		System.out.println("=================");
		System.out.println(" ");
		
		Iterator <String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		TreeSet<String> tr =new TreeSet<>(new Comparator<String>()
				{
			@Override
			public int compare(String o1,String o2)
			{
				return o2.compareTo(o1);
			}

			});
		
		//display these names in desc manner (lexicographic : desc)

		
		System.out.println("Sorted set "+tr);
		tr.addAll(hs);
		System.out.println("Sorted set "+tr);//no

	
		
		
		
		
		
		
		
		
		
		
		
	}

}
