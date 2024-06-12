public class DuplicateInString {
    public static void main(String[] args) {
        
        String[] arr = {"sk","mk","sk","gk","mk","sd","kf","gk"};
        int n = arr.length;

        System.out.print("Duplicate elements: ");

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n - 1; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < n; j++) {
                    
                    if (arr[i].equals(arr[j])) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (isDuplicate) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
