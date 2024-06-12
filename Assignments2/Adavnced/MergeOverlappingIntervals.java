public class MergeOverlappingIntervals {

    public static void mergeOverlappingIntervals(int[][] intervals) {
        if (intervals.length <= 1)
            return;
        
        for(int i = 1; i < intervals.length; i++){
        
        	if(intervals[i][0] < intervals[i - 1][0]){
        		
        		int[] temp = intervals[i];
        		intervals[i] = intervals[i - 1];
        		intervals[i - 1] = temp;
        		}
        }
  
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if (currStart <= end) {
                end = Math.max(end, currEnd);
            } else {
                System.out.println("[" + start + ", " + end + "]");
                
                start = currStart;
                end = currEnd;
            }
        }

        System.out.println("[" + start + ", " + end + "]");
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8,10}, {2,6},{15,18}};
        System.out.println("The merged intervals are: ");
        mergeOverlappingIntervals(arr);
    }
}
