import java.util.*;

public class PossibleTrianglesCount {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Range");
        
        int range = in.nextInt();
        int[] array = new int[range];
        for(int i = 0; i < range; i++){
            System.out.println("Enter the Element"+(i+1));
            array[i] = in.nextInt();
        }
        
        System.out.println("Number of possible triangles: " + countPositiveTriangles(array));
    }
    
    public static int countPositiveTriangles(int[] nums) {
        sort(nums);
        //System.out.println(Arrays.toString(nums));
        int count = 0;
        for(int i=nums.length-1;i>=0;i--) 
        {
            int left = 0;
            int right = i-1;
            while(left<right)
            {
                int sum = nums[left] +  nums[right];
                if(sum > nums[i])
                {
                    count = count + (right-left);
                   right--;
                }
                else{
                    left++;
                }
            }
        }
        return count;
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
