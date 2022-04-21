class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) {
            return s; 
        }
        
        StringBuilder sb = new StringBuilder();
        
    
        for (int i = 0; i < numRows; i++) {
            
            if (i == 0 || i == numRows - 1) {
            
                for (int j = i; j < s.length(); j = j + (numRows - 1) * 2) {
                    sb.append(s.charAt(j));
                }
            } else {
                int j = i;
                sb.append(s.charAt(j));
                
                while (j < s.length()) {
                    j = j + (numRows - i - 1) * 2;

                    if (j < s.length()) {
                        sb.append(s.charAt(j));
                    }
                    
                    j = j + i * 2;
                    if (j < s.length()) {
                        sb.append(s.charAt(j));
                    }
                }
            }
        }
        
        return sb.toString();
    }
}