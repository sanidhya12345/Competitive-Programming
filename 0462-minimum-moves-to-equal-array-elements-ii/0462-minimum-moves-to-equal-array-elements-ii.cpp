class Solution {
public:
    int minMoves2(vector<int>& nums) {
        sort(nums.begin(), nums.end()); // Sort the array
        int median = nums[nums.size() / 2]; // Median element
        int moves = 0;
        for (int i : nums) {
            moves += abs(median - i); // Calculate the sum of absolute differences
        }
        return moves;
    }
};