class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
        for(String x:str1){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        for(String x:str2){
            if(map.containsKey(x)) map.put(x,map.get(x)+1);
            else map.put(x,1);
        }
        int k=0;
        ArrayList<String> l=new ArrayList<>();
        for(Map.Entry m: map.entrySet()){
            if((int)m.getValue()==1) l.add((String)m.getKey());
        }
        String[] result=new String[l.size()];
        for(int i=0;i<l.size();i++)
            result[i]=l.get(i);
        return result;
    }
}