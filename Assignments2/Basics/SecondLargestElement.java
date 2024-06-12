
import java.util.*;

public class SecondLargestElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of An array");
        int range = in.nextInt();
        int[] array = new int[range];
        
        for(int i = 0; i < range; i++){
            System.out.println("Enter the Element"+(i+1));
            array[i] = in.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < range;i++){
            if(array[i] > max1){
                max2 = max1;
                max1 = array[i];
            }else if(array[i] > max2){
                max2 = array[i];
            }
        }
        System.out.println("The Second Largest Element is : "+max2);
        }
}
