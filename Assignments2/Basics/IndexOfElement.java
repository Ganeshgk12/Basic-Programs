import java.util.Scanner;

public class IndexOfElement
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
			System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the element to find index");
		int element = in.nextInt();
		
	    System.out.println("Index of "+element +" is " + findIndex(arr,element));
	    }
	    
	    public static int findIndex(int[] arr, int target){
	        int n = arr.length;
	        for(int i = 0; i < n; i++){
	            if(arr[i] == target){
	                return i;
	            }
	        }
	        return -1;
	    }
	    
	}


