import java.util.ArrayList;
import java.util.List;

public class Number_Of_Laser_Beams {
    public static int numberOfBeams(String[] bank) {
        List<Integer> frequency=new ArrayList<>();
        int count=0;
        for(String s:bank){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    count++;
                }
            }
            if(count>0){
                frequency.add(count);
            }
            count=0;
        }
        int ans=0;
        for(int i=0;i<frequency.size()-1;i++){
            int temp=frequency.get(i)*frequency.get(i+1);
            ans+=temp;
        }
        return ans;
    }
    public static void main(String[] args) {
        String [] bank={"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
}
