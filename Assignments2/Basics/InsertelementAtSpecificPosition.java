import java.util.Scanner;

public class InsertelementAtSpecificPosition
{
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
	    int range = in.nextInt();
	    
		int[] nums = new int[range+1];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    nums[i] = in.nextInt();
		    
		}
		System.out.println("Enter the elemnt to insert");
		int elemnt = in.nextInt();
		
		System.out.println("Enter the position to insert");
		int position = in.nextInt();
		
		nums = insertElement(nums, elemnt, position);
		
		System.out.print("After inserting : ");
		for(int num : nums){
		    System.out.print(num + " ");
		}
	}
	
	static int[] insertElement(int[] nums,int elemnt, int position){
	    
	    for(int i = nums.length - 2; i >= position - 1; i--){
	        nums[i + 1] = nums[i];
	    }
	    nums[position - 1] = elemnt;
	    
	    return nums;
	}
	
	
}
