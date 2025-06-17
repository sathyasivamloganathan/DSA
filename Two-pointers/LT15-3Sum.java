
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        for(int i=0; i<=nums.length - 3; i++) {
            int j=i+1;
            int n = nums.length - 1;
            if(nums[i] > 0 || (i>0 && nums[i]==nums[i-1])) {
                continue;
            }
            while(j < n) {
                int sum = nums[i]+nums[j]+nums[n];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[n]);
                    result.add(list);
                    while (j < n && nums[j] == nums[j + 1]) j++;
                    while (j < n && nums[n] == nums[n - 1]) n--;
                    j++;
                    n--;
                }
                else if(sum < 0) {
                    j++;
                }
                else if(sum > 0) {
                    n--;
                }
            }
        }
        return result;
    }
}



// Time complexity - O(N^2)
// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.

// Example 1:

// Input: nums = [-1,0,1,2,-1,-4]
// Output: [[-1,-1,2],[-1,0,1]]
// Explanation: 
// nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
// nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
// nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
// The distinct triplets are [-1,0,1] and [-1,-1,2].
// Notice that the order of the output and the order of the triplets does not matter.
// Example 2:

// Input: nums = [0,1,1]
// Output: []
// Explanation: The only possible triplet does not sum up to 0.
// Example 3:

// Input: nums = [0,0,0]
// Output: [[0,0,0]]
// Explanation: The only possible triplet sums up to 0.
 

// Constraints:

// 3 <= nums.length <= 3000
// -105 <= nums[i] <= 105