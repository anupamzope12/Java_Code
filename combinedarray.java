import java.util.Scanner;
public class combinedarray{
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		int size1;
		System.out.println("Ente size of array1");
		size1 =sc.nextInt();
		int arr1[]=new int [size1];
		
		int size2;
		System.out.println("Ente size of array2");
		size2 =sc.nextInt();
		int arr2[]=new int [size2];
		
		int size3 = size1 + size2;

		
		
		int arr3[]=new int [size3];
		int index=0;
		
		System.out.println("Enter the array1 elements");
		for(int i = 0 ; i<arr1.length ; i++)

		{
		
			arr1[i]=sc.nextInt();
			arr3[index]=arr1[i];
			index++;
		}
		
		System.out.println("Enter the array2 elements");
		for(int i = 0 ; i<arr2.length ; i++)

		{
		
			arr2[i]=sc.nextInt();
			arr3[index]=arr2[i];
			index++;
		}
		
		System.out.println("Combined of arr");
		for(int i=0 ; i<size3 ;i++)
		{
			System.out.println(arr3[i]);
		}
		
		
	}
	
}