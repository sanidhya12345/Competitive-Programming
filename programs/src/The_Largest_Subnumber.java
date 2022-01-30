import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * by sanidhya12345
 */
public class The_Largest_Subnumber {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int t = fr.nextInt();
        assert t>=1 &&  t<=10;
        for (int i = 0; i < t; i++) {
            long n,k;
            n = fr.nextInt();
            k = fr.nextInt();
            assert n>=1 && n<=1e5;
            assert k>=1 && k<=1e9;
            List<Long> po = new ArrayList<>();
            po.add( 1L);
            for (int j = 1; j < 1e5+1; j++) {
                po.add((po.get(j - 1) * (10 % k)) % k);
            }
            String str = fr.nextLine();
            assert n == str.length();
            for (int j = 0; j < str.length(); j++) {
                assert str.charAt(j) >= '0' && str.charAt(j) <= '9';
            }
            List<Long> list = new ArrayList<>();
            long xor = 0;
            for (int j = 0; j < str.length(); j++) {
                xor = xor^(str.charAt(j)-'0');
                list.add(xor);
            }

            long mXor = -1;
            long remain = 0;
            int c = 0;
            int index = -1;
            int sum = 0;
            for (int j = str.length() - 1; j >= 1; j--) {
                remain = ((((str.charAt(j) - '0') % k) * po.get(c)) % k + remain) % k;
                sum += (str.charAt(j) - '0');
                if ( remain == 0) {
                    if (list.get(j - 1) >= mXor && sum > 0) {
                        mXor = list.get(j - 1);
                        index = j;
                    }
                }
                c++;
            }
            if(index == -1)
                System.out.println(-1);
            else  {
                while (index < str.length() && str.charAt(index) == '0')
                    index++;
                if(index == str.length())
                    System.out.println(-1);
                else {
                    System.out.println(str.substring(index));
                }
            }

        }
    }

}