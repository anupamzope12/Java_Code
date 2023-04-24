import java.util.Scanner;
public class concat {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the size of array");
	int arr1[]=new int[sc.nextInt()];
	
	System.out.println("Enter the array element");
	for(int i=0 ; i<arr1.length ; i++)
	{
		arr1[i]=sc.nextInt();
	}
	
	System.out.println("Print array element");
	for(int j=0 ;j<arr1.length ; j++)
	{
		System.out.println(arr1[j]);
	}
	
	System.out.println("Enter the size of array");
	int arr[]=new int[sc.nextInt()];
	
	System.out.println("Enter the array element");
	for(int i=0 ; i<arr.length ; i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Print array element");
	for(int j=0 ;j<arr.length ; j++)
	{
		System.out.println(arr[j]);
	}
	
	}
}
