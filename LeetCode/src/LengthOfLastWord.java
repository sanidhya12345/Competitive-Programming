package LeetCode.src;
import java.util.ArrayList;
import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "India     Is My    Country";
        String [] res=s.split(" ");
        ArrayList<String> fnl=new ArrayList<>();
        for (int i = 0; i <res.length ; i++) {
            if (res[i]!=""){
                fnl.add(res[i]);
            }
        }
        System.out.println(fnl.get(fnl.size()-1).length());
    }
}