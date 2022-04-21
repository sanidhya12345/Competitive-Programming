class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
		
		int top=0,left=0;
		int bottom=n-1, right=n-1;
		
		int dir = 0;
		int val = 1;
		
		while(top<=bottom && left<=right) {
			
			if(dir==0) {
				for(int i=left; i<=right; i++)
					ans[top][i] = val++;
				
				top++;
			}
			else if (dir==1) {
				for(int i=top; i<=bottom; i++)
					ans[i][right] = val++; 
				
				right--;
			}
			else if (dir==2) {
				for(int i=right; i>=left; i--)
					ans[bottom][i] = val++;
				
				bottom--;
			}
			else if (dir==3) {
				for(int i=bottom; i>=top; i--)
					ans[i][left] = val++;
				
				left++;
			}
			
			dir = (1+dir)%4;
		}
		
		return ans;
    }
}