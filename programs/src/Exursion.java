import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exursion {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test_cases = Integer.parseInt(br.readLine());
        for (int i=0;i<test_cases;i++){
            String data=br.readLine();
            int boys = Integer.parseInt(data.split(" ")[0]);
            int girls = Integer.parseInt(data.split(" ")[1]);
            int seats=Integer.parseInt(data.split(" ")[2]);

            int rooms = ((boys+seats-1)/seats)+((girls+seats-1)/seats);
            System.out.println(rooms);
        }
    }
}