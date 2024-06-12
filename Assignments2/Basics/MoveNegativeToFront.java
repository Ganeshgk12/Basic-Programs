
import java.util.*;

public class MoveNegativeToFront {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
      
         System.out.println("Original Array : "+Arrays.toString(arr));
		
	    int j = -1;
		
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] >= 1){
		        j = i;
		        break;
		    }
		}
		for(int i = j+1; i < arr.length; i++){
		    if(arr[i] < 1){
		        swap(arr, i,j);
		        j++;
		    }
		}
		System.out.println("After Moving : "+Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int start, int end){
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	}
}
        
        




