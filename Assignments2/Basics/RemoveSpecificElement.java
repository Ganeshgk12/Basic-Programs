import java.util.Scanner;
import java.util.Arrays;

public class RemoveSpecificElement{
public static void main(String[] args){
	  
	  Scanner in = new Scanner(System.in);
	   System.out.println("Enter the Array range");
	   int range = in.nextInt();
	   int[] arr = new int[range];
	   
	   for(int i = 0; i < range; i++){
		   System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
	   }
	   
	       System.out.println("Enter the Element to Remove ");
		int element = in.nextInt();
		
		arr = removeElement(arr,element);
		
		for(int ans : arr){
			System.out.print(ans + " ");
		}
	}
	
	static int[] removeElement(int[] arr, int element){
		int index = 0; 
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == element){
				index = i;
			}
		}
		for(int i = index; i < arr.length - 1; i++){
			arr[i] = arr[i+1];
		}
		arr = Arrays.copyOf(arr,arr.length-1);
		return arr;
		
		
	}
}
		

