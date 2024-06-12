import java.util.*;

public class AverageExceptMamAndMin {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		
		int range = in.nextInt();
		int[] array = new int[range];
		
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    array[i] = in.nextInt();
		}
		System.out.println(average(array));
    }

    public static double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int salaries : salary) {
            sum += salaries;
            max = Math.max(max, salaries);
            min = Math.min(min, salaries);
        }

        int new_len = salary.length - 2;
        int avgMinMax = (max + min);

        return (double) Math.abs((sum - avgMinMax) / new_len);
    }
}
