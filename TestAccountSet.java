package tester;

import java.util.HashSet;

import com.code.AccountType;
import com.code.BankAcc;

public class TestAccountSet {
	public static void main(String[] args) {
		
		BankAcc a1=new BankAcc(101,"Vishal",AccountType.CURRENT,10000);
		BankAcc a2=new BankAcc(10,"Lalit",AccountType.SAVING,10000);
		BankAcc a3=new BankAcc(101,"Pavan",AccountType.ID,10000);
		BankAcc a4=new BankAcc(11,"Nilesh",AccountType.SAVING,10000);
		BankAcc a5=new BankAcc(121,"Vinit",AccountType.CURRENT,10000);
		
		//create empty HS of accounts
		
		HashSet<BankAcc> accounts=new HashSet<>();
		
		System.out.println("Added" + accounts.add(a1)); 
		System.out.println("Added" + accounts.add(a2));
		System.out.println("Added" + accounts.add(a3));
		System.out.println("Added" + accounts.add(a4));
		System.out.println("Added" + accounts.add(a5));

		System.out.println("Size" + accounts.size());
		
		for(BankAcc a: accounts)
			System.out.println(a);
		

				




	}

}
