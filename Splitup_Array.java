import java.util.Scanner;
public class Splitup_Array {
	
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]= new int [n];
		
		System.out.println("Accept Array");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Print Array Elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("1st array");
		int arr1[]=new int[n/2];
		//int k=n/2;
		for (int j=0 ; j<n/2 ; j++)
		{
			arr1[j]=arr[j];
			System.out.println(arr1[j]);
		}
	
		System.out.println("2nd array");
		int arr2[]=new int[n/2];		
		for (int m=n/2,j=0 ; m<n ; m++,j++)
		{
//			arr2[j]=arr[m];
			System.out.println(arr2[j]=arr[m]);
		}
	}
}