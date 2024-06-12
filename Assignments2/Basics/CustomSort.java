
import java.util.Arrays;

public class CustomSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        customSort(arr);
    }

    public static void customSort(int[] arr) {
        int n = arr.length;
        sort(arr);
        int left = 0, right = n - 1;
        
        while(left < right){
            System.out.print(arr[right--]+" ");
            System.out.print(arr[left++]+" ");
            if(left ==  right ){
           System.out.print(arr[left]+" ");
            
        }

    }
   }
    
    static void sort(int[] arr){
        
        for(int i = 0; i < arr.length- 1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            if(i > 0){
                if(arr[i] < arr[i-1]){
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    i = 0;
                }
            }
        }
    }
     
}
