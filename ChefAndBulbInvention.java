/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int testcases= sc.nextInt();
        while(testcases!=0){
            int n= sc.nextInt();
            int p=sc.nextInt();
            int k=sc.nextInt();
            int count;
            int g=p%k;
            int y = ((n-1)/k)*k;
            y=n-1-y;
            if (y<g){
                count=((n-1)/k)*g + (y+1);
            }
            else{
                count=((n-1)/k + 1) * g;
            }
            for (int i = g; i <n ; i+=k) {
                count+=1;
                if (i==p){
                    System.out.println(count);
                }
            }
            testcases--;
        }
	}
}
