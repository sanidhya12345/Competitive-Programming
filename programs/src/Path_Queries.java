import java.io.*;
public class Path_Queries {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            sb = new StringBuilder();
            String[] s1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int q = Integer.parseInt(s1[1]);
            int[] a = new int[n];
            String[] s = br.readLine().trim().split(" ");
            int oc = 0, ec = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(s[i]);
                if(a[i] % 2 == 0){
                    ec++;
                }else {
                    oc++;
                }
            }
            for (int i = 0; i < n - 1; i++) {
                br.readLine();
            }
            for (int i = 0; i < q; i++) {
                String[] s2 = br.readLine().trim().split(" ");
                int index = Integer.parseInt(s2[0]);
                int val = Integer.parseInt(s2[1]);
                if(a[index - 1] % 2 == 0){
                    ec--;
                }else {
                    oc--;
                }
                a[index - 1] = val;
                if(val % 2 == 0){
                    ec++;
                }else {
                    oc++;
                }
                long r = (long)ec * ((long)ec + 1) / 2 + (long)oc * ((long)oc + 1) / 2;
                sb.append(r).append(" ");
            }
            System.out.println(sb.toString());
        }
        br.close();
    }
}
