class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int count = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        for(int num : nums){
            count += max - num;
        }
        return count;
    

        
    }
}