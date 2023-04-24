import java.util.Arrays;
import java.util.Scanner;
public class RahulArray {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the size of array");
		
		int []arr=new int [sc.nextInt()];
		
		System.out.println("Enter the array elements");
		for(int i=0 ; i<arr.length ; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Print all array elements");
		for(int j=0 ; j<arr.length ; j++)
		{
			System.out.println(arr[j]);
		}
		
		System.out.println("counting the same array element");
		System.out.println("Enter the array element");
		int count=0;
		int num=sc.nextInt();
		for(int k=0 ; k<arr.length ; k++)
		{
			if(arr[k]==num)
				count++;
		}
		System.out.println("count = " + count++);
		
		Arrays.sort(arr);
//		System.out.println("Print All Elements");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//
//		int c = 0, k = 0;
//		for (int j = k + 1; j < arr.length; j++) {
//			if (arr[k] == arr[j]) {
//				c++;
//			} 
//			else {
//				System.out.println(arr[k] + " = " + (c + 1));
//				k = j;
//				c = 0;
//			}
//	}
//		System.out.println(arr[arr.length - 1] + " = " + (c + 1));\
		
		Arrays.sort(arr);
		int c=0 , k=0 ;
		for(int j = k +1 ; j<arr.length ; j++)
		{
			if(arr[k]==arr[j])
			{
				c++;
			}
			else {
				System.out.println(arr[k] + " = " + ( c + 1 ));
				k=j;
				c=0;
			}
		}
		System.out.println(arr[arr.length - 1] + " = " + ( c + 1 ));
	}
}
