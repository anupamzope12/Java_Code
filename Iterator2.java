package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {

	public static void main(String[] args) {
		
		ArrayList<Double>  list=new ArrayList<>();
		
		list.add(10.6);
		list.add(15.6);
		list.add(19.52);
		list.add(32323.3);
//		list.add("saeawdsareawe");
		list.add(14.611);
		list.add(12.61);
		list.add(13.6);
		list.add(17.65);//auto boxing
		
		Iterator <Double> itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		System.out.println(itr.next());
		
	}

}
