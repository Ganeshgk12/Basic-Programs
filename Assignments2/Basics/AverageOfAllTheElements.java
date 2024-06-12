import java.util.*;

public class AverageOfAllTheElements
{
	public static void main(String[] args) {
	    
	Scanner in = new Scanner(System.in);
		System.out.println("Enter the range");
		int range = in.nextInt();
		
		double[] arr = new double[range];
		for(int i = 0; i < range ;i++){
		    arr[i] = in.nextDouble();
		}
		System.out.println(Arrays.toString(arr));
		
		double sum = 0;
		for(int i = 0; i < range; i++){
		    sum += arr[i];
		}
		
		double average = sum / range;
		System.out.println("The Average of all the elements : "+average);
	}
}

