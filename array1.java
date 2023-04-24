import java.util.Scanner;
public class array1{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		
		char arr[]=new char[5];
		
		
		System.out.println("Enter the array elements");
//		for(int = 0 ; i<=arr.length ; i++)
		
		arr[0] = 'A';
		arr[1] = 'B';
		arr[2] = 'C';
		arr[3] = 'D';
		arr[4] = 'E';
		
//		for(int i = 0 ; i<4 ; i++ )
//		{
//			System.out.println(arr[i] + " ");
//		}
		
		int asciivalue1=arr[0];
		int asciivalue2=arr[1];
		int asciivalue3=arr[2];
	
		System.out.println("Ascii Value of index " + arr[0] + " is " + asciivalue1);	
		
		sc.close();

	}
}