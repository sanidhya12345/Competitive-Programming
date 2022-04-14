class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character first = s.charAt(i);
            Character second = t.charAt(i);
            if (map.containsValue(second) && !(map.containsKey(first))) return false; 
            if (map.containsKey(first) && !(map.get(first).equals(second))) return false;
            map.put(first, second);
        }
        return true;
    }
}