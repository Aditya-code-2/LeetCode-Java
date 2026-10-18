class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i : nums){
            if(i == candidate){
                count++;
            }else{
                count--;
                if(count == 0){
                    candidate = i;
                    count++;
                }
            }
        }
        return candidate;

       /* HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > nums.length / 2){
                return num;
            }
        }
        return -1;*/

        
    }
}