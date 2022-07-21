class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String digits="123456789";
        for(int i=1;i<=9;i++){
            for(int j=0;j<=digits.length()-1;j++){
                if(i+j<=digits.length()){
                    String substr=digits.substring(j,i+j);
                int value=Integer.parseInt(substr);
                if(value>=low && value <=high){
                    list.add(value);
                }
                }
                
            }
        }
        return list;
    }
}