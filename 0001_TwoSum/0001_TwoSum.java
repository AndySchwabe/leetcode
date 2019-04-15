class Solution {
/**
 * https://leetcode.com/problems/two-sum/
 * Runtime: 74 ms, faster than 5.03% of Java online submissions for Two Sum.
 * Memory Usage: 38.4 MB, less than 52.65% of Java online submissions for Two Sum.
 */
    public int[] twoSum(int[] nums, int target) {
    
        int solution[] = new int[2];
        
        outerloop:
        for (int i = 0; i < nums.length; i++){
            int result;
            result = (target - nums[i]);
            
            for (int j = 0; j < nums.length; j++){
                if ((result == nums[j]) && (i != j)){
                    solution[0] = i;
                    solution[1] = j;
                    break outerloop;
                }
            }
        }
        return solution;
    }
}