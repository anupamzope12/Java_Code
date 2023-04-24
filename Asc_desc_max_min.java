import java.util.Scanner;
public class Asc_desc_max_min {
	public static void main(String[] args)
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
		// mim
		
		int min=arr[0];
		
		for (int k=0 ; k<arr.length ; k++)
		{
			if(arr[k]<min)
				min=arr[k];
		}
		
		System.out.println("minimum : " + min);
		
		int max=arr[0];
		
		for (int k=0 ; k<arr.length ; k++)
		{
			if(arr[k]>max)
				max=arr[k];
		}
		
		System.out.println("Maximum : " + max);
		
		
		/* 
		 //aescending order
		int temp=0;
		for(int k=0 ; k<arr.length ; k++)
		{
			for(int l=k+1 ; l<arr.length ; l++)
			{
				if(arr[k]<arr[l])
				{
					//swapping
					temp=arr[k];
					arr[k]=arr[l];
					arr[l]=temp;
				}
			}
		}
		System.out.println("Dscending Order");
		for(int m=0 ; m<arr.length ; m++)
		{
			System.out.println(arr[m]);
		}
		
		int temp1=0;
		for(int c=0 ; c<arr.length ; c++)
		{
			for(int h=c+1 ; h<arr.length ; h++)
			{
				if(arr[c]>arr[h])
				{
					//swapping
					temp=arr[c];
					arr[c]=arr[h];
					arr[h]=temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(int n=0 ; n<arr.length ; n++)
		{
			System.out.println(arr[n]);
		}*/
		
	}
}
