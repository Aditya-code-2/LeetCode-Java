class Solution {
    public int singleNonDuplicate(int[] nums) {

       /* int low =0, high= nums.length-1;

        while(low <= high){
            int mid = low+(high-low)/2;
            
        }*/

        HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == 1) return nums[i];
        }
        return -1;
       
        
    }
}