import java.util.Scanner;

public class SumOfAllTheElements
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
		    arr[i] = in.nextInt();
		}
		
		int sum = 0;
		for(int i = 0; i < range; i++){
		    sum += arr[i];
		}
		System.out.println("Sum of all the elements : " + sum);
	}
}

