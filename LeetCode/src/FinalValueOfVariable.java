public class FinalValueOfVariable{
  public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String i:operations){
            if(i.equals("--X")|| i.equals("X--")){
                ans=ans-1;
            }
            if(i.equals("++X")|| i.equals("X++")){
                ans=ans+1;
            }
        }
        return ans;
    }
}
