import java.util.Arrays;
import java.util.Scanner;

public class StringtoChar {
	public static void main(String[]args)
	{
		// create a object of Scanner
		
		Scanner sc=new Scanner (System.in);
		
		//Accept Two Strings
		
		System.out.println("Enter String 1");
		String str1 = sc.next();
		
		System.out.println("Enter String 2 ");
		String str2 =sc.next();
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
}
}