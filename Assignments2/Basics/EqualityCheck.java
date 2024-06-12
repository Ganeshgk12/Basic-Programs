import java.util.Scanner;
public class EqualityCheck{

    public static void main(String[]  args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the range of first Array");
        int range1 = in.nextInt();
        
        System.out.println("Enter the range of second Array");
        int range2 = in.nextInt();
        
        if(range1 != range2){
            System.out.println("Arrays are not Same");
            return;
        }
        int[] arr1 = new int[range1];
        System.out.println("Enter the first Array elements");
        
        for(int i = 0; i < range1; i++){
            System.out.println("Enter the element"+(i+1));
            arr1[i] = in.nextInt();
        }
        
        int[] arr2 = new int[range1];
        System.out.println("Enter the second Array elements");
        
        for(int i = 0; i < range1; i++){
            System.out.println("Enter the element"+(i+1));
            arr2[i] = in.nextInt();
        }
        
       boolean ans = equalityCheck(arr1,arr2);
       System.out.println(ans ? "Arrays are Same" : "Arrays are not Same");
        
    }
    
    
    
    static boolean equalityCheck(int[] arr1, int[] arr2){
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
                
            }
        }
        return true;
    }
}


          


          