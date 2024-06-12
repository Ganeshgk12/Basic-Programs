
public class AntiDiagnoalPrinting
{
	public static void main(String[] args) {
	    int[][] matrix = {
	                      {1,2,3},
	                      {4,5,6},
	                      {7,8,9}
	    };
	    
	    if(matrix.length != matrix[0].length){
	        System.out.println("It's not possible to print AntiDiagnoal");
	        return;
	    }
	    
	    printAntiDiagnoal(matrix);
	}
	
	static void printAntiDiagnoal(int[][] matrix){
	    int n = matrix.length;
	    int i,j,k;
	    
	    for(i = 0; i < n; i++){
	        j = 0; 
	        k = i;
	        while(k >= 0){
	            System.out.print(matrix[j][k] +" ");
	            j++;
	            k--;
	        }
	        System.out.println();
	    }
	    
	    for(i = 1; i < n; i++){
	        j = i; 
	        k = n - 1;
	        while(j < n){
	            System.out.print(matrix[j][k] +" ");
	            j++;
	            k--;
	        }
	        System.out.println();
	    }
	    
	    
	}
}
