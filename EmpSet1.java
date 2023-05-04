package Self.Hashing.HashSet;

import java.util.HashSet;

import com.code.Emp;

public class EmpSet1 {
	public static void main(String[] args) {
		
	Emp e1=new Emp(101,"Anupam",50000); // t hc=1 eq 
	Emp e2=new Emp(102,"Devesh",60000); // t hc=1 eq 1
	Emp e3=new Emp(103,"Toshal",70000); // t hc=1 eq 1
	Emp e4=new Emp(104,"Harshal",80000); // t hc=1 eq 1
	Emp e5=new Emp(101,"Bhushan",90000);	// f hc=1 eq=1
	Emp e6=new Emp(105,"Aashish",50000); // t hc=1 eq=1
	Emp e7=new Emp(105,"Vinit",60000); // f hc=1  eq=2
	
	HashSet<Emp> emp1=new HashSet<>();
	
	System.out.println(emp1.add(e1));
	System.out.println(emp1.add(e2));
	System.out.println(emp1.add(e3));
	System.out.println(emp1.add(e4));
	System.out.println(emp1.add(e5));
	System.out.println(emp1.add(e6));
	System.out.println(emp1.add(e7));
	
	for(Emp e : emp1)
		System.out.println(e);
	
	
	
	}
}
