import java.util.Scanner;

public class SumOfTensEqualToTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
		System.out.println("Enter the Range");
		int range = in.nextInt();
		
		int[] array = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    array[i] = in.nextInt();
		}
		System.out.println("Enter the Target");
		int target = in.nextInt();

       
        int sum = 0;

        for (int value : array) {
            if (value == 10) {
              
                sum += value;
            }
        }

        if (sum == target) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
