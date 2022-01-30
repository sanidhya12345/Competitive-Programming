import java.util.Scanner;

public class Simon_Cannot_Sleep {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner (System.in);
        String [] time = sc.nextLine().split(":");
        int hh = Integer.parseInt(time[0]);
        int mm = Integer.parseInt(time[1]);
        int N = (11*(hh*60+mm))/(12*60);
        System.out.print(N+1);
    }
}
