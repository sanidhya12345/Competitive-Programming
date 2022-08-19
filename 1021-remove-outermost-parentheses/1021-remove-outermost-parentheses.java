class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String res = "";
        for(Character c: s.toCharArray()){
            if(c == '('){
                if(!st.isEmpty()){
                    res += c;
                }
                st.push(c);
            }else{
                st.pop();
                if(!st.isEmpty()){
                    res += c;
                }
            }
        }
        return res;
    }
}