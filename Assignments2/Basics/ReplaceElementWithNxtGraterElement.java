
import java.util.*;

class ReplaceElementWithNxtGraterElement {

    public static void main(String[] args){
       	Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
        replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;

        if (n <= 1) {
            arr[0] = -1;
            return arr;
        }

        int maxSoFar = arr[n - 1];
        

        for (int i = n - 2; i >= 0; i--) {
            int currentElement = arr[i];
            
            maxSoFar = Math.max(maxSoFar, currentElement);
            arr[i] = maxSoFar;
        }

        return arr;
    }
}
