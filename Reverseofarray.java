import java.util.Scanner;
public class Reverseofarray {
public static void main(String[]args)
{
	Scanner sc = new Scanner (System.in);

	System.out.println("Enter the size of an array");
	int arr[]=new int [sc.nextInt()];
	
	System.out.println("Enter arrays element");
	for(int i=0; i<arr.length ; i++)
	
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Reverse array ");
	
	for(int j=arr.length-1 ; j>=0 ; j--)
	
	{
	System.out.println(arr[j]);	
	}
	
}

}
