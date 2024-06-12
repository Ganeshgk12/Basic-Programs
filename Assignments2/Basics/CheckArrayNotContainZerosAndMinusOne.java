
import java.util.*;
public class CheckArrayNotContainZerosAndMinusOne
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
	    boolean contain0 = true;
	    boolean contain1 = true;
	    
	    for(int i = 0; i < arr.length; i++){
	        if(arr[i] == 0){
	            contain0 = false;
	            System.out.println("False");
	            return;
	        }else if(arr[i] == -1){
	            contain1 = false;
	        }
	    }
	    if(contain0 && contain1){
	        System.out.println("True");
	    }else{
	        System.out.println("False");
	    }
	
	}
}
