import java.util.Scanner;
public class FindRotationCount
{
	public static void main(String[] args) {
	    
	    Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] nums = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    nums[i] = in.nextInt();
		}
		System.out.println("The rotation count : "+findRotationCount(nums));
	}
	public static int findRotationCount(int[] nums) {
	   int n = nums.length;
	   
          if(n == 0 || n == 1){
            return 0;
        }
	 int pivot = findPivot(nums);
	     
        if(pivot == -1){
            return 0;
        }
        return pivot + 1;
        
    
    }
     public static int findPivot(int[] arr){
         
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            
            int mid = start + (end - start) / 2;
            
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid -1 ;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return - 1;
    }
}
