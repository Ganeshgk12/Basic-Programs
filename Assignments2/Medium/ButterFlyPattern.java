
public class ButterFlyPattern
{
	public static void main(String[] args) {
	    int range = 5;
	    printPattern2(range);
	}
	static void printPattern(int range){
	
	for(int row = 1; row < 2 *range; row++){
	        
	        int index = (row <= range) ? (row) : (2*range - row);
	        for(int col1 = 0; col1 < index; col1++){
	            System.out.print("*");
	        }
	        
	        int space = (row <= range) ? (2 * range - 2 * row) : (2 * row - 2 * range); 
	        for(int k = 0; k < space; k++){
	            System.out.print(" ");
	        }
	        
	        int index2 = (row <= range) ? (row) : (2*range - row);
	        for(int col2 = index2; col2 >= 1; col2--){
	            System.out.print("*");
	        }
	        
	        System.out.println();
	    }
   }
   
   	static void printPattern2(int range) {
   	
        	for (int row = 1; row < 2 * range; row++) {
    
        	int index = (row < range) ? (row) : (2 * range - row);
        	
        	int space = (row < range) ? (2 * range - 2 * row) : (2 * row - 2 * range);

        	for (int col = 0; col < 2 * range; col++) {
        
              	 	if (col < index) {
                		System.out.print("*");
            		} else if (col >= index && col < index + space) {
                		System.out.print(" ");
            		} else {
                		System.out.print("*");
           		 }
        	}
        
        	System.out.println();
   	    }
    }

}

