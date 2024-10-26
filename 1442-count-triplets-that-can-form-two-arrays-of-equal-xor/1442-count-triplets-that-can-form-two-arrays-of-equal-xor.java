class Solution {
   public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        
        // Cumulative XOR array
        int[] prefix = new int[n + 1];
        prefix[0] = 0;
        
        // Populate the cumulative XOR array
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        
        // Count valid triplets
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (prefix[i] == prefix[k + 1]) {
                    // For a fixed (i, k), there are (k - i) possible values for j
                    count += (k - i);
                }
            }
        }
        
        return count;
    }
}