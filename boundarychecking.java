import java.util.Scanner;

public class boundarychecking {
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		int ch=0;
		int arr[];
		
		System.out.println("1.Accept an array 2.Display Array 3.search element in an array 4.exit");
		
		System.out.println("How Many Elements do you want to store");
		
		int size=sc.nextInt();

		arr=new int[size];
		int index=0;
		System.out.println("Array Created for storing an elements of" + arr.length + "numbers");
		do {
			System.out.println("Enter a choice ");
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: 
				if(index<arr.length)
				{
					System.out.println("Enter a number to add");
					int number = sc.nextInt();
					arr[index]=number;
					index++;
					
				}
				else {
					System.out.println("array elements are full");
				}
			case 2:
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]+"  ");
				}
			case 3:
				System.out.println("Enter elements to find");
				int no = sc.nextInt();
				boolean flag = false;
				for (int i=0;i<index;i++)
				{
					if(arr[i]==no) {
						flag = true;
						break;
					}
					else 
						flag = false;
				}
				if (flag==truee)
			su=ystem.out.print;n(Prfesrmt)	
			}
			
			
			
		}while (ch != 5);
		
		
	}
}
