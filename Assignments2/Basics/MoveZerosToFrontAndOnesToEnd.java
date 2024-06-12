import java.util.Arrays;

public class MoveZerosToFrontAndOnesToEnd
{
	public static void main(String[] args) {
	    
		int[] arr = {1,1,0,0,1,0,1,2,0,0};
		
		int j = -1;
		
		for(int i = 0; i < arr.length; i++){
		
		
		    if(arr[i] == 1){
		        j = i;
		        break;
		    }
		}
	
		for(int i = j+1; i < arr.length; i++){
			if(arr[i] == 1 || arr[i] == 0){
		       if(arr[i] != 1){
		        swap(arr, i,j);
		        j++;
		    }
		}
	}
	System.out.println(Arrays.toString(arr));
		int left = 0;
		int right= arr.length - 1;
		
		while(left <= right){
			while(left <= right && arr[left] == 0){
			
			left++;
			}
		
			while(left <= right && arr[right] == 1){
			
			right--;
			}
		}
		System.out.println(Arrays.toString(arr));
		int index = (left + right) / 2;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != 0 && arr[i] != 1){
			
				arr[index++] = arr[i];
			
				}
		}	
				
			
		
		
		System.out.println(Arrays.toString(arr));
	}

	
	static void swap(int[] arr, int start, int end){
	    int temp = arr[start];
	    arr[start] = arr[end];
	    arr[end] = temp;
	}
	
	static void swap(int[] arr){
	for(int i = 1; i < arr.length; i++){
		if(arr[i] > arr[ i - 1]){
		
	   	 int temp = arr[i - 1];
	   	 arr[i - 1] = arr[i];
	   	 arr[i] = temp;
	}
	}
	}
}
