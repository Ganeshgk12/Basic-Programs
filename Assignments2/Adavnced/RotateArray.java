import java.util.Scanner;
public class RotateArray
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range ");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the element"+(i+1));
		    arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the rotation count ");
		int rotationCount = in.nextInt();
		
		if(rotationCount == 0){
			for(int i = 0; i < range; i++){
		    System.out.print(arr[i] + " ");
			}
		}
		if(rotationCount < 1){
			System.out.println("Please enter the possitive rotationCount ");
			return;
		}
		rotate(arr,rotationCount);
		
		for(int i = 0; i < range; i++){
		    System.out.print(arr[i] + " ");
		}
	}
	public static void rotate(int[] arr, int k){
	    int n = arr.length;
	    k = k % n;
	   /* if(k < 0){
	    
	        k = k + n;
	    }  */
	    reverse(arr, 0, k - 1);
	    reverse(arr, k, n - 1);
	    reverse(arr, 0, n - 1);
	    
	}
	public static void reverse(int[] arr, int start, int end){
	    while(start < end){
	        int temp = arr[start];
	        arr[start] = arr[end];
	        arr[end] = temp;
	        start++;
	        end--;
	    }
	    
	}
}
