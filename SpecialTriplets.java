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
            int c=0;
            long n= sc.nextLong();
            for (int i=1;i<=n;i++) {
                for (int j=i;j<=n;j+=i) {
                   if (j%i==0){
                       for (int k=i;k<=n;k+=j){
                           if (k%j==i){
                               c++;
                           }
                       }
                   }
                }
            }
            System.out.println(c);
            testcases--;
        }
	}
}
