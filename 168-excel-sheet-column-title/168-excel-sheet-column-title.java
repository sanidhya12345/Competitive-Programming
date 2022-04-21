class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            int mod = columnNumber % 26;
            if (mod == 0) {
                sb.append('Z');
                columnNumber = (columnNumber - 26) / 26;
            } else {
                sb.append((char)('A' + mod - 1));
                columnNumber = (columnNumber - mod) / 26;
            }  
        }
        return sb.reverse().toString();
    }
}