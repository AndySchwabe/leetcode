class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        int solution[] = new int[2];
        
        outerloop:
        for (int i = 0; i < nums.length; i++){
            int result;
            result = (target - nums[i]);
            
            for (int j = 0; j < nums.length; j++){
                if (result == nums[j]){
                    solution[0] = i;
                    solution[1] = j;
                    break outerloop;
                }
            }
        }
        return solution;
    }
}