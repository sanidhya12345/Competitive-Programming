class Solution {
     public void reverseString(char[] s) {
        reverse(s, 0, s.length-1);
    }
    void reverse(char[] arr, int f, int s){
        if(f>s){
            return;
        }
        char temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
        reverse(arr, ++f, --s);
    }
}