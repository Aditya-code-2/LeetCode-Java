class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        /*for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(Math.abs(i - j) >= indexDifference &&
                 Math.abs(nums[i] - nums[j]) >= valueDifference){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};*/

         int minIndex = 0;
        int maxIndex = 0;

        for (int i = indexDifference; i < nums.length; i++) {

            int j = i - indexDifference;

            if (nums[j] < nums[minIndex]) {
                minIndex = j;
            }

            if (nums[j] > nums[maxIndex]) {
                maxIndex = j;
            }

            if (nums[i] - nums[minIndex] >= valueDifference) {
                return new int[]{minIndex, i};
            }

            if (nums[maxIndex] - nums[i] >= valueDifference) {
                return new int[]{maxIndex, i};
            }
        }

        return new int[]{-1, -1};
        
    }
}