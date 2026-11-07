class Solution {
    public int countTime(String time) {
        int ans = 1;

        if (time.charAt(0) == '?' && time.charAt(1) == '?')
            ans *= 24;
        else if (time.charAt(0) == '?')
            ans *= (time.charAt(1) <= '3') ? 3 : 2;
        else if (time.charAt(1) == '?')
            ans *= (time.charAt(0) == '2') ? 4 : 10;

        if (time.charAt(3) == '?')
            ans *= 6;

        if (time.charAt(4) == '?')
            ans *= 10;

        return ans;
    }
}