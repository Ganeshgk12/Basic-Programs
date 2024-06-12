import java.util.Scanner;

public class ClockwiseRotation {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		
		int[] arr = new int[range];
		int n = arr.length;
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
		System.out.println("Enter the rotation count");
		int rotationCount = in.nextInt();
		
		if(rotationCount == 0){
			for(int i = 0; i < range; i++){
		    System.out.print(arr[i] + " ");
			}
		}
		
		if(rotationCount < 1){
			System.out.println("Please enter the possitive rotationCount ");
			return;
		}
		
       	System.out.print("Original Array : ");
               for (int i = 0; i < n; i++) {
            		System.out.print(arr[i] + " ");
       	 }
       	 System.out.println();

                rotateClockwise(arr, rotationCount);
                System.out.print("After Rotated : ");
        
        	for (int i = 0; i < n; i++) {
            	System.out.print(arr[i] + " ");
        	}
    }

    public static void rotateClockwise(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k < 0) {
            k = k + n;
        }
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - k - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
