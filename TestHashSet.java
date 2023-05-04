package Self.Hashing.HashSet;

import java.util.HashSet;

public class TestHashSet {
	public static void main(String[]args)
	{
	
		HashSet<String> hs1 =new HashSet<>();
		String[] str= {"Anupam","Harshal","Sammer","vaibhav","Apurva"};
		
		for(String s:str)
		{	
			System.out.println(hs1.add(s));
		}
		System.out.println(str.hashCode());
		System.out.println(str.getClass());
		System.out.println(hs1.contains("Anupam"));
		System.out.println(hs1.remove("Anupam"));
		System.out.println(hs1);
		System.out.println(hs1.contains("Anupam"));	
	}

}
