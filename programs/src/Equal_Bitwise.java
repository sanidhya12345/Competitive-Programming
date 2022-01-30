import java.io.OutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.BufferedInputStream;
import java.util.HashMap;


/**
 * @author sanidhya
 */

 class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EqualBitwiseOperations solver = new EqualBitwiseOperations();
        solver.solve(1, in, out);
        out.close();
    }

    static class EqualBitwiseOperations {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            HashMap<Integer, Integer> map = new HashMap<>();
            long ans = 0;
            int n = in.scanInt();
            long mod = 1000000007;
            int count = 0;
            for (int i = 0; i < n; i++) {
                int temp = in.scanInt();
                if (temp == 0) {
                    count++;
                } else {
                    map.put(temp, map.getOrDefault(temp, 0) + 1);
                }
            }
            ans = (ans + CodeHash.pow(2, count, mod) - 1 + mod) % mod;
            for (int i : map.keySet()) {
                ans = (ans + CodeHash.pow(2, map.get(i) - 1, mod)) % mod;
            }
            out.println(ans);
        }

    }

    static class CodeHash {
        public static long pow(long a, long b, long m) {
            long res = 1;
            a %= m;
            while (b > 0) {
                if ((b & 1) == 1) res = (res * a) % m;
                a = (a * a) % m;
                b >>= 1;
            }
            return res;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}