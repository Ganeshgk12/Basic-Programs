import java.util.Scanner;

public class ReverseChar{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the range");
	int range = in.nextInt();
	char[] charArray = new char[range];
	
	for(int i =0; i < range; i++){
		System.out.println("Enter the char"+(i+1));
		charArray[i] = in.next().charAt(0);
	}
	
	int len = charArray.length;
	int i = 0;
	
	while(i < len/2)
	{
		char temp = charArray[i];
		charArray[i] = charArray[len - i - 1];
		charArray[len - i - 1] = temp;
		i++;
	}
		System.out.println("After Reversing");
		for(char ch : charArray){
			System.out.print(ch + " ");
		}
	}
}	
