import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		//write a java program to check whether given two Strings are anagram or not
		//i/p: "the more codes"
		//i/p: "here come dots"
		//o/p: Strings are anagram
		//o/p: Strings are not anagram
		String s1="the mhre codes";
		String s2="here come dots";
		int flag=1,count=0;
		char [] arr1 = s1.toCharArray();
		char [] arr2 = s2.toCharArray();
	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=arr2[i])
			{
				System.out.println("not anagram");
				break;
			}
			else {
				count++;
			}
			
		}
		if(count == arr1.length) {
			System.out.println("anagram");
		}
	}
}
