class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            
            if(!stk.isEmpty() && stk.peek().equals(c)){
                stk.pop(); 
            }else{
                stk.push(c);
            }
        }
        
        while(stk.size() > 0){
            sb.insert(0, stk.pop()); 
        }
        
        return sb.toString();
  }
}