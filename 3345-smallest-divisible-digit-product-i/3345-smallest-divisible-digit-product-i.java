class Solution {
    
    public  int digProduct(int n) {
		int product=1;
		while(n!=0) {
			int m=n%10;
			product=product*m;
			n=n/10;
		}
		return product;
	}
    public  int smallestNumber(int n, int t) {
        if(n%10==0) {
        	return n;
        }
        int ans=0;
        for(int i=n;i<=100;i++) {
        	int product=digProduct(i);
        	if(product%t==0) {
        		ans=i;
        		break;
        	}
        }
        return ans;

    }
}