import java.util.Scanner;

public class CopyOfAnArray{
public static void main(String[] args){
	  
	  Scanner in = new Scanner(System.in);
	   System.out.println("Enter the Array range");
	   int range = in.nextInt();
	   
	   int[] arr = new int[range];
	   int[] ans = new int[range];
	   for(int i = 0; i < range; i++){
		   System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
	   }
	   
	   for(int i = 0; i < arr.length; i++){
		    ans[i] = arr[i];
	  }
	  System.out.println("New Array Elements : ");
	  for(int result : ans){
	  	System.out.print(result + " ");
	  }
	}
}
