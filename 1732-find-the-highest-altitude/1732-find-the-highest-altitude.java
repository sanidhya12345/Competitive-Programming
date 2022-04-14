class Solution {
    public int largestAltitude(int[] gain) {
        int temp=0;
        ArrayList <Integer> arr = new ArrayList<Integer>();
        arr.add(0);
        for(int i=0; i<gain.length; i++)
        {
            temp = temp+ gain[i];
            arr.add(temp);
        }
        return Collections.max(arr);
    }
}