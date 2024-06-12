import java.util.*;

public class StaircaseClimbing {
    
     public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total number of steps");
        int totalSteps = in.nextInt();
        
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] possibleSteps = new int[range];
		System.out.println("Enter the possible steps can move ");
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the possible step"+(i+1));
		    possibleSteps[i] = in.nextInt();
		}
        
        
        System.out.println("Number of unique ways to climb " + totalSteps+ " steps: " + countWaysToClimbStairs(totalSteps, possibleSteps));
    }
    
    public static int countWaysToClimbStairs(int n, int[] x) {
       
        int[] ways = new int[n+1];
        
        ways[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int step : x) {
                if (i - step >= 0) {
                    ways[i] += ways[i - step];
                }
            }
        }
        
        return ways[n];
    }
}
