class Solution {
    public String largestOddNumber(String num) {
       boolean b = false;
    String ans = "";
    for(int i=num.length()-1;i>=0;i--)
    {
        if(Character.getNumericValue(num.charAt(i))%2!=0)
        {
            ans = num.substring(0,i+1);
            b=true;
            break;
         }
    }
         if(b)
         return ans;
         else 
         return "";
    }
}