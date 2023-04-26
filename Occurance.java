import java.util.Scanner;
public class Occurance {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter String");
		String s1=sc.nextLine().toLowerCase();
		System.out.println("enter char to find");
		char ch2=sc.next().charAt(0);
		char ch = Character.toLowerCase(ch2);
		int count=0;

			for(int i=s1.length()-1;i>=0;i--)
			{
				if(s1.charAt(i)==ch)
				{
					count++;
					if(count==2) 
					{
						System.out.println("2nd last position of character "+ch+" is : "+i);
						break;
					}
					
					
				}
			}
			if(count==0) {
				System.out.println("characteer not present");
			}
			else if(count==1) {
				System.out.println("Character occurence less than 2");
			}
		
	}
	}
