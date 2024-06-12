import java.util.Scanner;

public class CommonElementsBetweenTwoStrings
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the range of  first string");
		int range1 = in.nextInt();
		
		String[] strArray1 = new String[range1];
		in.nextLine();
		for(int i = 0; i < range1; i++){
		    System.out.println("Enter the element"+(i+1));
		    strArray1[i] = in.nextLine();
		}
		
		System.out.println("Enter the range of  second string");
		int range2 = in.nextInt();
		
		String[] strArray2 = new String[range2];
		in.nextLine();
		for(int i = 0; i < range2; i++){
		    System.out.println("Enter the element"+(i+1));
		    strArray2[i] = in.nextLine();
		}
		
		System.out.print("The common elements between two Arrays are : ");
		for(int i = 0; i < range1; i++){
		    for(int j = 0; j < range2; j++){
		        if(strArray1[i].equals(strArray2[j])){
		            System.out.print(strArray1[i] + " ");
		            break;
		        }
		    }
		}
		
	}
}
