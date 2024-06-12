
import java.util.*;
public class CommonElementsFromThreeArrays
{
	public static void main(String[] args) {
		int[] arr1 = {3,4,7,12,15,22, 25};
		int[] arr2 = {1,3,5,7,9,11,15};
		int[] arr3 = {2,3,4,9,11,12,15,22};
	    
	    System.out.println("The Common Elements From Three Arrays :");
		for(int i = 0; i < arr1.length; i++){
		    for(int j = 0; j < arr2.length; j++){
		        for(int k = 0; k < arr3.length; k++){
		            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]){
		            System.out.println(arr1[i]);
		        }
		        }
		    }
		}
	}
}
