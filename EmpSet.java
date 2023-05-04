package Self.Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

import com.code.Emp;

public class EmpSet {
public static void main(String[]args)

{
	
	Emp e1=new Emp(101,"Manager",50000);
	Emp e2=new Emp(102,"Employee",60000);
	Emp e3=new Emp(103,"Director",70000);
	Emp e4=new Emp(101,"Chief Director",80000);
	
	HashSet <Emp> emp=new HashSet<>();
	
	System.out.println(emp.add(e1));
	System.out.println(emp.add(e2));
	System.out.println(emp.add(e3));
	System.out.println(emp.add(e4));
	
	System.out.println(emp.size());
	//gives correct o/p
	for(Emp i : emp)
		System.out.println(i);
	
//gives incorrect o/p
	
//	Iterator <Emp> itr=emp.iterator();
//	
//	while(itr.hasNext())
//		itr.next();
//	
//	System.out.println(itr);
	
}
}
