import java.util.Scanner;
public class add_count {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner (System.in);
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
	
	/*System.out.println("Enter the number to find in array ");
	int num=sc.nextInt();
	int count=0;
	for(int k=0 ; k<arr.length ; k++)
	{
		if(arr[k]==num)
		{
			count++;
		}
		break;
		else 
		{
			System.out.println("Number not found");
		}
	
	System.out.println(count);*/
	
	int sum=0;
	System.out.println("Addition");
	for(int s=0 ;s<arr.length ; s++)
	{
		sum +=arr[s];
	}
	System.out.println(sum);
	
	System.out.println("Reversing");
	
	for(int l=arr.length-1 ; l>=0 ; l--)
	{
		System.out.println(arr[l]);
	}
	
	
	}
}
