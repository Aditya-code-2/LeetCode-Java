class Solution {
    public int rob(int[] nums) {
        int first = 0;
        int second = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int ans = Math.max(nums[i] + first, second);
            first = second;
            second = ans;
        }

        return second;
        
    }
}