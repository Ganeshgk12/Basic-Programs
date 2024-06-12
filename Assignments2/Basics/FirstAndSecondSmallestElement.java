
import java.util.*;

public class FirstAndSecondSmallestElement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of An array");
        int range = in.nextInt();
        int[] array = new int[range];
        
        for(int i = 0; i < range; i++){
            System.out.println("Enter the Element"+(i+1));
            array[i] = in.nextInt();
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < range;i++){
            if(array[i] < min1){
                min2 = min1;
                min1 = array[i];
            }else if(array[i] < min2){
                min2 = array[i];
            }
        }
        System.out.println("The Smallest Element is : "+min1);
        System.out.println("The Second Smallest Element is : "+min2);
        }
}
