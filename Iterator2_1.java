package Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2_1 {
	
	//without iterator we can also print the values
	
	public static void main (String[]args) {
	ArrayList list=new ArrayList();
	
	list.add(101);
	list.add("Anuosihs");
	list.add(10154.25);
	list.add(101.5f);
	
	Iterator<Integer>itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	

}
	
}