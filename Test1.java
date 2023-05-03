package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String[]args)
	{
		ArrayList <Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60); //autoboxing
//		
//		for(Integer al:list )
//			System.out.println(al);
//		for(int i=0;i<list.size() ; i++)
//		
//		{
//			System.out.println(list.get(i));
//		}
		
		Iterator<Integer>itr=list.iterator();//itr : before 1st elem , before index 0
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}
}
