import java.util.Arrays;

public class MoveZerosToEnd
{
	public static void main(String[] args) {
		int[] arr = {2, 0, 8, 12, 0 , 0, 15, 26, 0, 0};
		
		int j = -1;

		for(int i =0; i < arr.length; i++){
		
			if( j < 0){
		  	  if(arr[i] == 0){
		       	     j = i;
		   	  }
		  	}   
		        if(arr[i] != 0 && j > 0){
		           swap(arr, i,j);
		             j++;
		        }
	        }
		
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int start, int end){
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	}
	
}
