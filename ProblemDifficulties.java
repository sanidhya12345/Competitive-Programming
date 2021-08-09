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
            int [] array=new int[4];
            for (int i = 0; i <4 ; i++) {
                array[i]= sc.nextInt();
            }
            Set<Integer> setint=new HashSet<>();
            for (int i = 0; i <4 ; i++) {
                setint.add(array[i]);
            }
            if (setint.size()==4){
                System.out.println(2);
            }
            else if (setint.size()==3){
                System.out.println(2);
            }
            else if (setint.size()==2){
                Arrays.sort(array);
                int search=array[0];
                int count=0;
                for (int i = 0; i <4 ; i++) {
                    if (array[i]==search){
                        count++;
                    }
                }
                if (count==2){
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
            else{
                System.out.println(0);
            }
            testcases--;
        }
	}
}
