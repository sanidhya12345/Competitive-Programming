import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int [] array=new int[5];
	    for(int i=0;i<array.length;i++){
	        array[i]=sc.nextInt();
	    }
	    int count=0;
	    int search=sc.nextInt();
	    for(int i=0;i<array.length;i++){
	        if(search==array[i]){
	            count++;
	        }
	    }
	    if(count==1){
	            System.out.println("found");
	        }
	        else{
	            System.out.println("not found");
	        }
	   
	}
}