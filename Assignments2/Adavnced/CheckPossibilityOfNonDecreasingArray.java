
import java.util.*;

public class CheckPossibilityOfNonDecreasingArray
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the range of an Array");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		for(int i = 0; i < arr.length; i++){
		    
		    System.out.println("Enter the elemnt"+(i+1));
		    arr[i] = in.nextInt();
		    
		}
	    	System.out.println(checkPossibility(arr));
		
		
	}
	
	public static boolean checkPossibility(int[] nums) {
        int count = 0;
        
        for(int i = 1; i < nums.length; i++){
        	
        	if(nums[i] < nums[i - 1]){
        		count++;
        		
        		if(count > 1){
        			return false;
        		}
        		if(i >= 2 && nums[i] < nums[i - 2]) {
        			nums[i ] = nums[i - 1];
        		}
        		else{
        			nums[i - 1]  = nums[i ];
        		}
        	}
    }
    return true;
}
}
