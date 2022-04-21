/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.Scanner;
import java.util.Stack;

public class Kartik_Sir_And_Coding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> s=new Stack<>();
        long q=sc.nextInt();
        while(q!=0){
            int queryType=sc.nextInt();
            if(queryType == 1){
                if(s.empty()){
                    System.out.println("No Code");
                }
                else {
                    System.out.println(s.peek());
                    s.pop();
                }
            }
            else {
                int cost =sc.nextInt();
                s.push(cost);
            }
        }
    }
}
