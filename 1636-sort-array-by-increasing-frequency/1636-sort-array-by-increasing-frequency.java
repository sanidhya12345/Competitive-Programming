class Solution {
   public int[] frequencySort(int[] nums) {
Map<Integer,Integer> m=new HashMap<>();
int n=nums.length;
int a[]=new int[n];
for(int v:nums)
{
if(m.containsKey(v))
{
m.put(v,m.get(v)+1);
}else{
m.put(v,1);
}
}
List<Map.Entry<Integer, Integer> > list =
new LinkedList<Map.Entry<Integer, Integer> >(m.entrySet());
Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
public int compare(Map.Entry<Integer, Integer> o1,
Map.Entry<Integer, Integer> o2)
{
if(o1.getValue() == o2.getValue())
{
return (o2.getKey()).compareTo(o1.getKey());
}
return (o1.getValue()).compareTo(o2.getValue());
}
});

    HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
    for (Map.Entry<Integer, Integer> aa : list) {
        temp.put(aa.getKey(), aa.getValue());
    }
    // System.out.println(list);
    // System.out.println(temp);
   int p=0;
       for (Map.Entry<Integer, Integer> it : temp.entrySet()) {
            int val=it.getValue();
           while( val-- >0)
           {
               a[p++]=it.getKey();
           }
        }
       
   
    return a;
}
}