package Self.Hashing.LinkedHash;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test3 {
	public static void main(String[] args) {
		
		LinkedHashSet <String> hs1 = new LinkedHashSet <>();
		String []str= {"Anupam","Harshal","Sammer","vaibhav","Apurva"};
		
		for(String s:str)
			hs1.add(s);
		System.out.println("===========");
//		System.out.println(hs1);
		Iterator<String> itr=hs1.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println(hs1.contains("Anupam"));
		
	}
}
