
import java.util.*;
public class CheckArrayContainstwoSpecificNumbers
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
		
		check(array);
	}
	public static void check(int[] arr){
	    boolean contain65 = false;
	    boolean contain77 = false;
	    
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == 65){
	            contain65 = true;
	        }else if(arr[i] == 77){
	            contain77 = true;
	        }
	    }
	    if(contain65 && contain77){
	        System.out.println("True");
	    }else{
	        System.out.println("False");
	    }
	
	}
}
