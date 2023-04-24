import java.util.Scanner;

public class arr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr = new int[sc.nextInt()];

		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("print the array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  ");
		}

		System.out.println("----Reverse of array elements----");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i] + "  ");
		}

	}
}
