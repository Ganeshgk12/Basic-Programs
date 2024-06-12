import java.util.Scanner;

public class SortNumericAndStringArray{
	public static void main(String[] args){
	
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the integer array range");
		int intRange = in.nextInt();
		
		
		
		int[] num_array = new int[intRange];
		String[] string_array = new String[stringRange];
		
		
		System.out.println("Enter the integer elements ");
		
		for(int i = 0; i < intRange; i++){
			System.out.println("Enter the Element"+(i+1));
			num_array[i]  = in.nextInt();
		}
		
		in.nextLine();
		
		System.out.println("Enter the String Elements ");
		System.out.println("Enter the String array range");
		
		int stringRange = in.nextInt();
		
		for(int i = 0; i < stringRange; i++){
			System.out.println("Enter the element"+(i+1));
			string_array[i]  = in.nextLine();
		}
		
		sortNumeric(num_array);
		sortString(string_array);
		
		for(int num : num_array){
			System.out.print(num + " ");
		}
		
		for(String str : string_array){
			System.out.print(str + " ");
		}
		
	}
	static String[] sortString(String[] str){
	
		for (int i = 0; i < str.length; i++) {
              		 for (int j = 1; j < str.length - i; j++) {
               	 int pos = 0;
               	 
              		 while (pos < str[j].length() && pos < str[j-1].length() 
                       		 && Character.toLowerCase(str[j].charAt(pos)) == Character.toLowerCase(str[j-1].charAt(pos))) {
                   			 pos++;
              		  }
                
                	if (pos < str[j].length() && pos < str[j-1].length() 
                        	  && Character.toLowerCase(str[j].charAt(pos)) < Character.toLowerCase(str[j-1].charAt(pos))) 
                        	  {
                    		  String temp = str[j];
                    		  str[j] = str[j-1];
                   		  str[j-1] = temp;
                    	         }
                
            	    	}
       	 }
       	 return str;
        }
        
        static int[] sortNumeric(int[] arr){
        	
        	for(int i = 0; i < arr.length -1 ; i++){
        		if(arr[i] > arr[i + 1])
        		{
        			int temp = arr[i];
        			arr[i] = arr[ i + 1];
        			arr[i + 1] = temp;
        		}
        		
        		if(i > 0){
        			if(arr[i] < arr[i - 1])
        			{
        				int temp = arr[i];
        				arr[i] = arr[i - 1];
        				arr[i -1] = temp;
        				i = 0;
        			}
        		}
        		
        	}
        	return arr;
        }
 }
        
        	
