class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String i:strs){
            char [] arr=i.toCharArray();
            Arrays.sort(arr);
            String news=new String(arr);
            map.put(news,new ArrayList<String>());
        }
        for(String str:strs){
            char [] arr=str.toCharArray();
            Arrays.sort(arr);
            String news=new String(arr);
            if(map.containsKey(news)){
                map.get(news).add(str);
            }
        }
        List<List<String>> list=new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
    }
}