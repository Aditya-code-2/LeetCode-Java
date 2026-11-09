
class Solution {
    public int getMinSwaps(String num, int k) {

        char[] arr = num.toCharArray();

        // 1. Find kth next permutation
        for(int i = 0; i < k; i++){
            nextpermu(arr);
        }

        // 2. Minimum adjacent swaps
        char[] target = arr;
        char[] curr = num.toCharArray();

        int swaps = 0;

        for(int i = 0; i < curr.length; i++){

            if(curr[i] == target[i]){
                continue;
            }

            int j = i + 1;

            while(j < curr.length && curr[j] != target[i]){
                j++;
            }

            while(j > i){
                char temp = curr[j];
                curr[j] = curr[j-1];
                curr[j-1] = temp;

                swaps++;
                j--;
            }
        }

        return swaps;
    }

    private void nextpermu(char[] arr){

        int i = arr.length - 2;

        // 1. Find pivot
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }

        // 2. Find next greater digit
        if(i >= 0){

            int j = arr.length - 1;

            while(arr[j] <= arr[i]){
                j--;
            }

            // 3. Swap
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 4. Reverse right part
        int left = i + 1;
        int right = arr.length - 1;

        while(left < right){

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
