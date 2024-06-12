import java.util.Scanner;
public class CountNumberOfWays
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the ROW size");
		int row = in.nextInt();
		
		System.out.println("Enter the COL size");
		int col = in.nextInt();
		
		System.out.println("The total number of ways : "+countWays(row,col));
	}
	
	static int countWays(int row,int col){
	    if(row == 1 || col == 1){
	        return 1;
    	}
    	int down = countWays(row - 1, col);
    	int right = countWays(row, col - 1);
    	
    	return down+right;
	}
	    
}

