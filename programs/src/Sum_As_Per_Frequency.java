/*
 * Copyright (c) 3-3/8/22, 7:59 PM by Sanidhya Varshney
 */

import javax.swing.text.Utilities;
import java.util.*;

public class Sum_As_Per_Frequency {
    static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfWords, V value)
    {
        List<K> listOfKeys = null;

        if(mapOfWords.containsValue(value))
        {
            listOfKeys = new ArrayList<>();

            for (Map.Entry<K, V> entry : mapOfWords.entrySet())
            {

                if (entry.getValue().equals(value))
                {
                    listOfKeys.add(entry.getKey());
                }
            }
        }
        // Return the list of keys whose value matches with given value.
        return listOfKeys;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while (q!=0){
            int l= sc.nextInt();
            int r= sc.nextInt();
            HashMap<Integer,Integer> hmap=new HashMap<>();
            int count=0;
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count+=1;
                    }
                }
                hmap.put(arr[i],count);
                count=0;
            }
            System.out.println(hmap);
            int sum=0;
            List<Integer> list=new ArrayList<>();
            for(Integer i: hmap.values()){
                list= Sum_As_Per_Frequency.getAllKeysForValue(hmap,i);
                for(Map.Entry<Integer, Integer> entry: hmap.entrySet()) {

                }
            }
            System.out.println(list);
            q-=1;
        }

    }
}
