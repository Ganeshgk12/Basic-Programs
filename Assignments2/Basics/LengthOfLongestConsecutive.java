import java.util.Scanner;
public class LengthOfLongestConsecutive{
        public static void main(String[] args){

           Scanner input = new Scanner(System.in);
           System.out.println("Enter the range of the Array");
           
             int range = input.nextInt();
             int[] array = new int[range];
             
           for(int i = 0; i < range; i++){
                 System.out.println("Enter the  element "+ (i+1) );
                  array[i] = input.nextInt();
             }
             if(array.length == 0){
             		System.out.println("Length of the Longest Consecutive Elements is : 0" );
             		return;
             	}
             sort(array);
             
             System.out.println("Length of the Longest Consecutive Elements is : "+findLongestConsecutiveLength(array));
         }
         
static int[] sort(int[] array){
         for(int i = 0; i < array.length; i++){
                for(int j = 1; j < array.length; j++){
                      if(array[j] < array[j-1]){
                          int temp = array[j];
                               array[j] = array[j-1];
                               array[j-1] = temp;
                         }
                  }
         }
             return array;
     }
     
static int findLongestConsecutiveLength(int[] array){
	int len = array.length;
	int currentLength = 1;
	int maxLength = 1;
	for(int i = 0; i < len- 1; i++){
		if(array[i] == array[i+1]){
			continue;
		}
 		else if(array[i] + 1 == array[i + 1]){
			currentLength ++;     
              }else{
              		if(currentLength > maxLength){
              			maxLength = currentLength;
              		}
              		currentLength = 1;
              	}
        }
        if(currentLength > maxLength){
        	maxLength = currentLength;
         }
         
   return maxLength;
}
}
   
