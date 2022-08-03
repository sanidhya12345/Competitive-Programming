class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length ; i++) {
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            String val=new String(ar);
            if(!map.containsKey(val)){
                map.put(val,new ArrayList<>());
            }
            map.get(val).add(strs[i]);
        }

        ArrayList<List<String>> list1 = new ArrayList<>();

        list1.addAll(map.values());

        return list1;

    }
}