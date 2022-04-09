class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(char c:s.toCharArray()){
            if(map.containsValue(c)){
                stack.push(c);
            }
            else if(map.containsKey(c) && !stack.isEmpty() && stack.peek()==map.get(c)){
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}