
import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int arr[] = new int[sc.nextInt()];

		System.out.println("Enter array Elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reverse of an array is");
//		System.out.println("Enter a number to find it's occurance: ");
//		int num=sc.nextInt();
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==num)
//				count++;
//		}
		
//		System.out.println("Occurance of a number "+num+" is "+count+" times ");
		
		Arrays.sort(arr);
		System.out.println("Print All Elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

		int c = 0, k = 0;
		for (int j = k + 1; j < arr.length; j++) {
			if (arr[k] == arr[j]) {
				c++;
			} else {
				System.out.println(arr[k] + " = " + (c + 1));
				k = j;
				c = 0;
			}
	}
		System.out.println(arr[arr.length - 1] + " = " + (c + 1));

//		int count =0;
//		for(int i=0;i<arr.length;i++) {
//			count=0;
//			for(int j=0;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					count++;
//				}
//			}
//			System.out.println("arr"+arr[i]+"count="+count);
//		}

//		int element;
//
//		System.out.println("Seacrh array element");
//		System.out.println("Enter Element to search");
//		element=sc.nextInt();
//		boolean found=false;
//		for(int i=0 ; i<arr.length ; i++)
//		{
//			if(arr[i]==element)
//		{
//			
//			found = true;
	
		
//		if(found = true)
//			
//		{
//			System.out.println("Array found at index : " + i);
//			break;
//		}
//		if (element != arr[i])
//		{
//			System.out.println("Elemet not found");
//		}
			
//		}	
//	}
//		System.out.println("Counting");
//		int num;
//		int count=0;
//		System.out.println("Enter an array element to count");
//		num=sc.nextInt();
//		
//		for(int i=0 ; i<arr.length ; i++)
//		{
//			if (arr[i]==num)
//				count++;	
//		}
//		System.out.println(count++ +" ");
			sc.close();
	}
}
