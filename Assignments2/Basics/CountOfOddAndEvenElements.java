import java.util.Scanner;

public class CountOfOddAndEvenElements
{
	public static void main(String[] args) {
	    
		Scanner in = new Scanner(System.in);
		int range = in.nextInt();
		
		int[] array = new int[range];
		for(int i = 0; i < range; i++){
		    array[i] = in.nextInt();
		}
		int oddCount = 0;
		int evenCount = 0;
		
		for(int i = 0; i < arr.length; i++){
		    if(arr[i] %2 == 0){
		        evenCount++;
		    }else{
		        oddCount++;
		    }
		}
		System.out.println("Total number of even elements :"+evenCount);
		System.out.println("Total number of odd elements :"+oddCount);
		
	} 
}
