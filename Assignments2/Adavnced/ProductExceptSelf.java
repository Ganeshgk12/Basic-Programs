import java.util.*;

public class ProductExceptSelf {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		
		int[] input = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    input[i] = in.nextInt();
		}
		
        int[] result = productExceptSelf(input);
        System.out.println(Arrays.toString(result)); 

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;

      //  int[] leftProducts = new int[n];
      //  int[] rightProducts = new int[n];
        int[] result = new int[n];

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

     /*   for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        } */

        return result;
    }
}
