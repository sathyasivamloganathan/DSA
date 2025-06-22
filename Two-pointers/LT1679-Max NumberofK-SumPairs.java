class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0, j=nums.length-1;
        int count = 0;
        while(i<j) {
            int sum = nums[i] + nums[j];
            if(sum > k) {
                j--;
            } else if(sum < k) {
                i++;
            }
            else if(sum == k) {
                count++;
                i++;
                j--;
            }
        }
        return count;
    }
}


// Time complexity O(n log n), space complexity O(1)

/* To achieve O(N) use hashmap. Iterate the arr using the loop from 0 to len - 1. Check the sum = k-nums[i]. 
Add the num[i] to map if sum not seen already.
If seen rempve the element if it is 1 occurances else decrease the occuranses by 1. 

*/ 
// You are given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

// Return the maximum number of operations you can perform on the array.

// Example 1:

// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.
 

// Constraints:

// 1 <= nums.length <= 105
// 1 <= nums[i] <= 109
// 1 <= k <= 109