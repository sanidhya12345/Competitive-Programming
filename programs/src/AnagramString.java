/*
 * Copyright (c) 3/2/22, 7:02 PM by Sanidhya Varshney
 */

public class AnagramString {
    public static void main(String[] args) {
        String s="cotxazilut";
        String t="nahrrmcchxwrieqqdwdpneitkxgnt";
        int[] map = new int[26];
        int count = 0;
        for(int i  = 0; i < s.length(); i++){
            map[s.charAt(i) - 'a']++;
        }
        for(int i  = 0; i < t.length(); i++){
            map[t.charAt(i) - 'a']--;
        }
        for(int i: map){
            count += Math.abs(i);
        }

        System.out.println(count);
    }
}
