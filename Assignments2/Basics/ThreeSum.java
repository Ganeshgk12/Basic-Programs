import java.util.*;

public class ThreeSum
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] array = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    array[i] = in.nextInt();
		}
		System.out.println("Enter The Target");
		int target = in.nextInt();
		
	    threeSum(array,target);
	}

public static void threeSum(int[] nums,int target) {
    
        Sort(nums);
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

    }
    
    static void Sort(int[] arr){
        
        for(int i = 0; i < arr.length- 1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            if(i > 0){
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    i = 0;
                }
            }
        }
    }
}


