class Solution {
    public int calculate(String s) {
        int n = s.length();
        int num = 0;
        int sign = '+';
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            num = num * 10 + (ch - '0');

            if((!Character.isDigit(ch) && ch != ' ') || i == s.length() -1){
                if(sign == '+') st.push(num);
                if(sign == '-') st.push(-num);
                if(sign == '*') st.push(st.pop() * num);
                if(sign == '/') st.push(st.pop() / num);
                sign = ch;
                num = 0;

            }

        }
        int ans  = 0;
        for(int x  : st) ans += x;
        return ans;
        
    }
}