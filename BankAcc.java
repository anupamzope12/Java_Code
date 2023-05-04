package com.code;

import java.util.PrimitiveIterator.OfDouble;

public class BankAcc {
	
	private int accNo;
	private String CustomerName;
	private AccountType type;
	private double balance;
	
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", CustomerName=" + CustomerName + ", type=" + type + ", balance=" + balance
				+ "]";
	}

	public BankAcc(int accNo, String customerName, AccountType type, double balance) {
		super();
		this.accNo = accNo;
		CustomerName = customerName;
		this.type = type;
		this.balance = balance;
	}
	
	@Override
	public boolean equals(Object o) {
		System.out.println("In equals");
		if (o instanceof BankAcc)
	 		return this.accNo==((BankAcc)o).accNo;
	 		return false;
	}
	
	//override hashcode
	// same busket variable 
	
//	public int hashcode()
//	{
//		System.out.println("in acc hc");
//		return 10;
//	}
	// different busket
	@Override
	public int hashCode()
	{
		System.out.println("in acc hc");
		return accNo;
	}
	
	
	
	
	

	
}
