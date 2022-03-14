class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] visited = new boolean[nums.length + 2];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0 && nums[i] <= nums.length + 1) {
                visited[nums[i]] = true;
            }
        }
        for (int i = 1; i < visited.length; i++) {
            if (!visited[i]) {
                return i;
            }
        }
        return -1;
    }
}