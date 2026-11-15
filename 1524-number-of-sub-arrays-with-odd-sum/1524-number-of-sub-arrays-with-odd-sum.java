class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        /*int newlen =  n*(n+1)/2;
        long newSub[] = new long[newlen];
        int k = 0;
      
        int count = 0;

        for(int i = 0; i < n; i++){
            long sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];

                newSub[k] = sum;
                k++;
            }
           
        }
        for(int i = 0; i < newlen; i++){
           if(newSub[i] % 2 != 0){
            count++;
           }
          
        }
        return count;*/
        int mod = 1000000007, count = 0, sum = 0, odd = 0, even = 1;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum % 2 == 0){
                count = (count + odd) % mod;
                even++;
            }
            if(sum % 2 != 0){
                count  = (count + even) % mod;
                odd++;
            }
        }
        return count;
        
    }
}