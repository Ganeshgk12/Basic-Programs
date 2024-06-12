
import java.util.Scanner;

public class FindMinAndMax {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
		System.out.println("Enter the Range");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
        
        int min = arr[0];
        int max = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        
        System.out.println("Max value is :" +max);
        System.out.println("Max value is :" +min);
    }

    
}
