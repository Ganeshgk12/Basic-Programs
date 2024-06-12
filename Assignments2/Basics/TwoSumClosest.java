import java.util.*;

public class TwoSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 2, -4};
        int target = 1;

        System.out.println(twoSumClosest(nums, target));
    }

    public static int twoSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1]; 
        
        if(closestSum == target){
        	return closestSum;
        }
        int n = nums.length;

            int left = 0;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[left] + nums[right];
                if (currentSum == target) 
                    return currentSum;

                if (Math.abs(currentSum - target) < Math.abs(closestSum - target))
                    closestSum = currentSum;

                if (currentSum < target)
                    left++;
                else
                    right--;
        }

        return closestSum;
    }
}
