import java.util.Scanner;
public class Occurance1 {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		
//		System.out.println("Enter String");
		
		String str="hi everyone how are you";
		char[] c =str.toCharArray();
		
		System.out.println("Enter char");
		char ch =sc.next().charAt(0);
		int count=0;
		for(int i=c.length-1;i>=0;i--)
		{
			if(ch==c[i])
			{
				count++;
				if(count==2)
				{
					System.out.println(i);
				}
			}
		}
	}
}
