package CodingBlocks.src;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class DictionaryOrderL {
    static void permute(String s , String answer,List<String> list)
    {
        if (s.length() == 0)
        {
            list.add(answer);
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String right_substr = s.substring(i+1);
            String left_substr = s.substring(0,i);

            String rest = left_substr+right_substr;
            permute(rest, answer + ch,list);
        }
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s;
        String answer="";
        s = scan.nextLine();
        String original = new String(s);
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        s = new String(temp);
        List<String> list = new ArrayList<>();
        permute(s,answer,list);
        int idx = 0;
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).compareToIgnoreCase(original) == 0) {
                idx = i;
                break;
            }
        }
        for(int i = idx + 1; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
