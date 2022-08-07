class Solution {
   private  String invert(String s){
        char [] array=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(array[i]=='1'){
                array[i]='0';
            }
            else{
                array[i]='1';
            }
        }
        return new String(array);
    }
    private  String reverse(String s){
        StringBuilder str=new StringBuilder(s);
        return str.reverse().toString();
    }
    
    public char findKthBit(int n, int k) {
        String [] array=new String[n];
        array[0]="0";
        for(int i=1;i<n;i++){
            array[i]=array[i-1]+"1"+reverse(invert(array[i-1]));
        }
        
        return array[n-1].charAt(k-1);
    }
}