class Solution {
    public String frequencySort(String s) {
         int k=s.length();
        Map<Character,Integer> nm=new HashMap<>();
        for(int i=0;i<k;i++)
        {
            char c=s.charAt(i);
            nm.put(c , nm.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>> kk=new ArrayList<>(nm.entrySet());
        Collections.sort(kk , new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1 , Map.Entry<Character,Integer> e2)
            {
                return e2.getValue() - e1.getValue();
            }
        });
        StringBuilder gg=new StringBuilder();
        for(Map.Entry<Character,Integer> f: kk)
        {
            char c=f.getKey();
            int d=f.getValue();
            while(d-->0)
            {
                gg.append(c);
            }
        }
        return gg.toString();
    }
}