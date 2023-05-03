package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator4 {
	public static void main(String[]args)
	{
		ArrayList<Float> list=new ArrayList<>();
		
		list.add(10.120f);
		list.add(11.520f);
		list.add(12.05f);
		list.add(13.8f);
		list.add(14.5f);
		
		Iterator<Float> itr=list.iterator();
		
//		list.remove(1);
		
		list.set(0, 100.1f);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
