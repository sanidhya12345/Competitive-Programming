class Solution {
        public int searchInsert(int[] A, int target) {
        if(A==null) return 0;
        if(target <= A[0]) return 0;
        for(int i=0; i<A.length-1; i++){
            if(target > A[i] && target <= A[i+1]){  
                return i+1;
            }
        }
        return A.length;
    }
}