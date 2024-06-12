import java.util.Scanner;

public class PartitionPossibility{
    
public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
		System.out.println("Enter the Range");
		int range = in.nextInt();
		int[] multiSet = new int[range];
		for(int i = 0; i < range; i++){
		    System.out.println("Enter the Element"+(i+1));
		    multiSet[i] = in.nextInt();
		}
    System.out.println(canPartition(multiSet));
}
    public static boolean canPartition(int[] num){
        
    int sum=0;
    
    for(int i=0;i<num.length;i++){
        
        sum=sum+num[i];
    }
    
        if(sum %2!= 0)
    
            return false;
    
        int targetSum=sum/2;
    
        return canPartitionRecursive(num,0,targetSum);
    }
    
    public static boolean canPartitionRecursive(int num[],int index,int targetSum){
        
    if(targetSum==0){
        return true;
    }
    
    if(index==num.length || targetSum<0){
        return false;
    }
    
    return canPartitionRecursive(num,index+1,targetSum-num[index]) ||
        canPartitionRecursive(num,index+1,targetSum);
    }

}
