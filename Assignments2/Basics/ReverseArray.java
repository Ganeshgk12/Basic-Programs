
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 5, 9, 12, 1};

        int start = 0;
        int n = arr.length;
        //int end = arr.length - 1;
        while (start < n/2) {
            
            int temp = arr[start];
            arr[start] = arr[n - start - 1];
            arr[n - start - 1] = temp;

            start++;
        }

        System.out.println(Arrays.toString(arr));
    }
}

