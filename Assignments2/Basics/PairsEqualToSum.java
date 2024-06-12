import java.util.*;

public class PairsEqualToSum {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int target = 6;
        
        System.out.println("The pairs are :");
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] +" " +arr[j]);
                    break;
                }
            }
        }
    
    }
}