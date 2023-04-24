import java.util.Scanner;

public class testarray {

	public static void main (String[]args)
	{
		
	int arr[]= new int [5];
	
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	
	//display the array elements
	//for loop
	for(int i=0;i<arr.length;i++)
	
	{
		System.out.println(arr[i] + " ");
	}
	
	System.out.println();
	
	// for each
	for(int s : arr)
	{
		System.out.println(s + "  ");
	}
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println();
	
	System.out.println("Capacity=" );
	
	int size = sc.nextInt();
	int[]arr1 = new int[size];
	
	System.out.println("Size of Arr1: " + arr1.length);
	
	for (int i=0;i<arr1.length;i++)
	{
		System.out.println("ENter Array Element");
		arr1[i] = sc.nextInt();
	}
	
	System.out.println("---Array Elements---");
	
	for(int i=0;i<arr1.length;i++)
	{
		System.out.println(arr1[i]+ " ");
	}
	
	System.out.println("---Array Elements---");
	
	for (int n:arr1)
	{
		System.out.println(n + "  ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
