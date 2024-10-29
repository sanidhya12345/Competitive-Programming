public class Solution {
    // Function to find the first position of the target
    public int binarySearchLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        return left; // Left pointer is at the first occurrence or insert position
    }

    // Function to find the last position of the target
    public int binarySearchRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1; // Move to the right half
            } else {
                right = mid - 1; // Move to the left half
            }
        }
        return right; // Right pointer is at the last occurrence or insert position
    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int leftIndex = binarySearchLeft(nums, target);
        int rightIndex = binarySearchRight(nums, target);

        // Check if the target exists in the array
        if (leftIndex <= rightIndex && leftIndex < nums.length && nums[leftIndex] == target) {
            ans[0] = leftIndex; // First position
            ans[1] = rightIndex; // Last position
        } else {
            ans[0] = -1; // Target not found
            ans[1] = -1;
        }

        return ans;
    }
}
