import java.util.Scanner;
public class MajorityElement
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] arr = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    arr[i] = in.nextInt();
		}
		int n = arr.length;
		
		int count = 0;
		int ele = -1;
		
		for(int i = 0; i < n; i++){
		    if(count == 0){
		        ele = arr[i];
		        count++;
		    }
		    else if(arr[i] == ele){
		        count++;
		    }else{
		        count--;
		    }
		}
		int cntr1 = 0;
		for(int i = 0; i < n; i++){
		    if(arr[i] == ele){
		        cntr1++;
		    }
		}
		if(cntr1 > n/2){
		    System.out.println("The Majority Element : "+ele);
		}
		else{
		    System.out.println(-1);
		}
	}
}
