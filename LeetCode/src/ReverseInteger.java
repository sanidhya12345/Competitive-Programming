import java.util.ArrayList;

public class ReverseInteger {
    int pow(int num,int exp)
    {
        int mul=1;
        for (int i = 1; i <=exp ; i++) {
            mul*=num;
        }
        return mul;
    }
    public int reverse(int x){
        int b=x;
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        int m,k=10;
        int result=0;
        while(x>0){
            m=x%10;
            count++;
            arr.add(m);
            x=x/10;
        }
        for (Integer integer : arr) {
            result += integer * pow(10, count - 1);
            count--;
        }
        if (b>0){
            return result;
        }
        return b;
    }
    public static void main(String[] args) {
        ReverseInteger obj=new ReverseInteger();
        int out=obj.reverse(-123);
        System.out.println(out);
    }
}
