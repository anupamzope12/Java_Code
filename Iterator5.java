package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterator5 {
	public static void main(String[]args)
	{
		ArrayList <Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(50);
		list.add(80);
		list.add(90);
		
		Iterator<Integer> itr1=list.iterator();
		while(itr1.hasNext())
		System.out.print(itr1.next());
		
		ListIterator<Integer> itr=list.listIterator(list.size());
		while(itr.hasPrevious())
		System.out.println(itr.previous());
	}
}
