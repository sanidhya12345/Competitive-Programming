/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import java.util.*;
import java.io.*;
public class Athletes {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        HashMap<Integer, String> hp = new HashMap<>();
        while (n != 0) {
            String [] arr=bi.readLine().split(" ");
            String name=arr[0];
            int [] scores=new int[6];
            for (int i = 0; i <6 ; i++) {
                scores[i]=Integer.parseInt(arr[i+1]);
            }
            Arrays.sort(scores);
            int max=scores[scores.length-1];
            hp.put(max,name);
            n -= 1;
        }
        ArrayList<Integer> sortedkey=new ArrayList<>();
        for (int i:hp.keySet()) {
            sortedkey.add(i);
        }
        Collections.sort(sortedkey);
        for (int i = sortedkey.size()-1; i>=0; i--) {
            System.out.println(hp.get(sortedkey.get(i)));
        }
    }
}
