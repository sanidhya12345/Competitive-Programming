/*
 * Copyright (c) 3-3/2/22, 6:05 PM by Sanidhya Varshney
 */

public class CountingWordsWithgivenPrefix {
    public static void main(String[] args) {
        String [] words = {"leetcode","win","loops","success","code"};
        String pref="code";
        int count=0;
        for (String i: words) {
            if(i.length()>=pref.length()){
                String sub=i.substring(0,pref.length());
                if(sub.equals(pref)){
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
