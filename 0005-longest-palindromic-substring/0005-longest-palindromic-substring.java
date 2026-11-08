class Solution {
    public String longestPalindrome(String s) {

        String maxWord = "";

        for(int i = 0; i < s.length(); i++) {
            for(int j = i + 1; j <= s.length(); j++) {

                String subWord = s.substring(i, j);

                if(palindrom(subWord)) {
                    if(subWord.length() > maxWord.length()) {
                        maxWord = subWord;
                    }
                }
            }
        }

        return maxWord;
    }

    public boolean palindrom(String word) {

        int i = 0;
        int j = word.length() - 1;

        while(i < j) {

            if(word.charAt(i) != word.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}