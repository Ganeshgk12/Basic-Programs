import java.util.Scanner;

public class DiffBetweenMaxAndMin
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] array = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    array[i] = in.nextInt();
		}
		
		int min = getMin(array);
		int max = getMax(array);
		int difference = max - min;
		
		if(array.length > 1){
		    System.out.println("The difference between "+max + " and "+min +" is :"+difference);
		}else{
		    System.out.println(-1);
		}
	
	}
	public static int getMax(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return arr[max];
    }
    
    public static int getMin(int[] arr){
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return arr[min];
    }
}
