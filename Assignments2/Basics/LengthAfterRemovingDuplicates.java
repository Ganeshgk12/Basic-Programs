import java.util.*;

public class LengthAfterRemovingDuplicates {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] arr = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
        int n = arr.length;

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            boolean isDuplicate = false;

            
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                count++;
            }
        }

        System.out.println("Length After removing duplicates : "+count);
    }
}
