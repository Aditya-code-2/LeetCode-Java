class Solution {
    public String longestPalindrome(String s) {

        String maxWord = "";
        for(int i = 0; i < s.length(); i++){
            for(int j = i + 1; j <= s.length(); j++){
                String subWord = s.substring(i, j);
                

                if(palindrome(subWord)){
                    if(subWord.length() > maxWord.length()){
                        maxWord = subWord;
                   
                    }
                }
            }
        }
        return maxWord;
        
    }
    public boolean palindrome(String s){
        int n = s.length()-1;
        int left = 0;
        while(left < n){
            if(s.charAt(left) != s.charAt(n)){
                return false;
            }
            left++;
            n--;
        }
        return true;
    }
    
    
    
}