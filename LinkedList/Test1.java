package Self.Hashing.LinkedHash;
import java.util.Iterator;  
import java.util.LinkedHashSet;  
	  
	public class Test1 {   
	     public static void main(String args[]){    
	            LinkedHashSet<String> lh=new LinkedHashSet(); // Implementing HashSet     
	                   
	            	   lh.add("A");    // Adding elements  
	                   lh.add("B");      
	                   lh.add("C");     
	                   lh.add("D");    
	                   lh.add("E");    
	                   
	                   Iterator<String> i=lh.iterator(); // Traversing objects    
	                   
	                   while(i.hasNext()) // Return true if the Scanner has another token input    
	                   
	                   {    
	                   System.out.println(i.next());// printing elements     
	                   }    
	    }   


}
