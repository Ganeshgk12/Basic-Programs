
import java.util.*;
public class MatrixAddition
{
	public static void main(String[] args) {
		
		int[][] mat1= {
		               {2,3,4},
		               {4,5,6},
		               {6,7,8}
		    
		};
		               
		int[][] mat2 = {
		                {9,8,7},
		                {7,6,5},
		                {5,4,3}
		};
		
		
		for(int i = 0; i < 3; i++){
		    for(int j =0; j < 3; j++){
		        mat1[i][j] = mat1[i][j] + mat2[i][j];
		    }
		}
		for(int i = 0; i < 3; i++){
		    System.out.println(Arrays.toString(mat1[i]));
		}
		
	}
}

