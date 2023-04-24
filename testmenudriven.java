import java.util.Scanner;

public class testmenudriven {
	
	public static void main (String[]args) 
	{
		Scanner sc =new Scanner (System.in);
		System.out.println("1 : Notebook 50rs 2 : Pen 20rs 3 : colourbox 80rs 4 : Total Bills 5 : Exit ");
		int choice;
		double amount =0;
		int qty=1;
		do {
			
		System.out.println("Enter a choice : ");
		choice=sc.nextInt();
		int Total_amount=0;
			
		switch(choice)
		 {
		case 1:
			System.out.println("Enter a quantity of notebook ");
			qty = sc.nextInt();
			amount = amount + (qty*50);
			
			Total_amount+=amount;
			
			System.out.println("Total amount = " + Total_amount);
			
			break;
		case 2:
			System.out.println("Enter a quantity of pen ");
			qty = sc.nextInt();
			amount = amount + (qty*20);
			
			Total_amount+=amount;

			System.out.println("Total amount = " + Total_amount);
			
			break;
			
		case 3:
			System.out.println(" Enter a quantity of colourbox ");
			qty = sc.nextInt();
			amount =amount +(qty*80);
			System.out.println(" Total amount = " + amount);
			
			Total_amount+=amount;
			System.out.println("Total amount = " + Total_amount);
			break;
		case 4:
			
			System.out.println(" Total amount = " + amount);
			
			Total_amount+=amount;
			System.out.println("Total amount = " + Total_amount);
			break;
		case 5:
			System.out.println("Invalid number ");
			break;
		}
		
		}while(choice!=5);
			
		System.out.println("---End of menu---");
		
		}	
	}