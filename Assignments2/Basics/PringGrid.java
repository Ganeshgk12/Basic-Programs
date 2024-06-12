import java.util.Scanner;

public class PringGrid
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = in.nextInt();
		
		printPattern(range);
	}
	
	static void printPattern(int range){
	    
	    for(int row = 0; row < 2 * range; row++){
	        for(int j = 0; j < 2 * range; j++){
	            System.out.print("-"+" ");
	        }
	        System.out.println();
	    }
	}
}
