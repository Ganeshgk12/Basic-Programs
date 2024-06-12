public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 12,15, 17, 8, 5, 5};
        int[] arr2 = {5, 18, 2, 3, 1, 15};
        
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = -1;
                    break; 
                }
            }
        }
    }
}
