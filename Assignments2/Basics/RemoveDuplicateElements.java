import java.util.Scanner;
public class RemoveDuplicateElements {
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

        System.out.print("After Removig Duplicates: ");

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < n; j++) {
                    
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (!isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
