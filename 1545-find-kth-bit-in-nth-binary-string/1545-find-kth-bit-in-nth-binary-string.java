class Solution {
    public char findKthBit(int n, int k) {
        
        String[] str = new String[n];
        str[0]="0";
        for(int i=1;i<n;i++){
            str[i]=formstr(str[i-1]);
        }
        return str[n-1].charAt(k-1);
        
        
    }
    private String formstr(String sg){
        return sg + "1" + reverse(inverse(sg));
        
    }
    private String reverse(String sg){
        return new StringBuilder(sg).reverse().toString();
    }
    private String inverse(String sg){
        StringBuilder sb = new StringBuilder();
        for(char c: sg.toCharArray()){
            if(c == '1'){
                sb.append("0");
            }
            else{
                sb.append("1");
            }
        }
        return sb.toString();
    }
}