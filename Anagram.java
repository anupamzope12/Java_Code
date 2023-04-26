import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String[]args)
	{
		// create a object of Scanner
		
		Scanner sc=new Scanner (System.in);
		
		//Accept Two Strings
		
		System.out.println("Enter String 1");
		String str1 = sc.next();
		
		System.out.println("Enter String 2 ");
		String str2 =sc.next();
		
		// check if length is same
		if(str1.length()==str2.length())
		{
			//convert String to array
			char[] charArray1=str1.toCharArray();
			char[] charArray2=str2.toCharArray();
			
			// sort the char Array
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//is sorted arrays are same then the string is anagram
			
			boolean result=Arrays.equals(charArray1, charArray2);
			if(result)
				System.out.println("Anagram");
			
		}
		else 
			System.out.println("Not Anagram");
		
	}
	
	
}
