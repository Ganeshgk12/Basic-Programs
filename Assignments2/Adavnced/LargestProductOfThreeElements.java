import java.util.Scanner;

public class LargestProductOfThreeElements
{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the range of an Array");
		int range = in.nextInt();
		
		int[] nums = new int[range];
		for(int i = 0; i < nums.length; i++){
		    
		    System.out.println("Enter the elemnt"+(i+1));
		    nums[i] = in.nextInt();
		    
		}
		if(nums.length < 3){
		    System.out.println("We can't find a largest product of three elements...");
		    return;
		}
		System.out.println("The largest product : "+maximumProduct(nums));
	}
	
    public static int maximumProduct(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max3 = max2;
                max2 = max;
                max = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }

            if (nums[i] < min) {
                min2 = min;
                min = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return findmax(min * min2 * max, max * max2 * max3);
    }
    
    static int findmax(int num1 , int num2){
        if(num1 > num2){
            return num1;
        }
        return num2;
    }
}
