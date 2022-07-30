class Solution {
    public int maximum69Number (int num) {
        if(num==9 || num==99 || num==999 || num==9999 || num==9999 || num==99999){
            return num;
        }
        ArrayList<Integer> list=new ArrayList<>();
        String number=Integer.toString(num);
        int i=0;
        while(i<number.length()){
            char [] chars=number.toCharArray();
            if(chars[i]=='9'){
                chars[i]='6';
            }
            else{
                chars[i]='9';
            }
            String str=new String(chars);
            list.add(Integer.parseInt(str));
            i++;
        }
        return Collections.max(list);
    }
}