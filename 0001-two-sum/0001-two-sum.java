class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> ans = new HashMap<>();
        int sum = 0;

        for(int i = 0; i < n; i++){
            int required = target - nums[i];

            if(ans.containsKey(required)){
                return new int[]{ans.get(required), i};
            }
            ans.put(nums[i], i);
        }
        return new int[]{};
        
    }
}