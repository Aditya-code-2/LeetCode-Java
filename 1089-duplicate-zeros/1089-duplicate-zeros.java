class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                if(j < n) temp[j++] = 0;
                if(j < n) temp[j++] = 0;
            }else{
                if(j < n) temp[j++] = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
        
    }
}