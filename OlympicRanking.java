/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
        int testcases= sc.nextInt();
        while(testcases!=0){
            int g1= sc.nextInt();
            int s1= sc.nextInt();
            int b1=sc.nextInt();
            int g2= sc.nextInt();
            int s2= sc.nextInt();
            int b2=sc.nextInt();
            if (g1+s1+b1>g2+s2+b2){
                System.out.println(1);
            }
            else{
                System.out.println(2);
            }
            testcases--;
        }
	}
}
