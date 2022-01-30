import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

    /**
     * #
     *
     * @author sanidhya
     */
    public class ABeautyFactor {
        public static long MOD = 1000000007;
        static int last;
        static long[][] dp;
        static boolean[][] check;

        public static void main(String[] args) throws FileNotFoundException {
            // PrintWriter out = new PrintWriter(new FileOutputStream(new File(
            // "output.txt")));
            PrintWriter out = new PrintWriter(System.out);
            Scanner in = new Scanner();
            int k = in.nextInt();
            int n = in.nextInt();
            int result = -1;
            for (int i = 1; i < (1 << 9); i++) {
                if (Integer.bitCount(i) != n) {
                    continue;
                }

                if (cal(i) != k) {
                    continue;
                }
                int val = 0;
                for (int j = 0; j < 9; j++) {
                    if (((1 << j) & i) != 0) {
                        val = val * 10 + j + 1;
                    }
                }
                //System.out.println(Integer.toBinaryString(i) + " " + val);
                if (result == -1 || result > val) {
                    result = val;
                }
            }
            out.println(result);
            out.close();
        }

        static int cal(int mask) {
            int result = 0;
            for (int i = 0; i < 9; i++) {
                if (((1 << i) & mask) != 0) {
                    result += (i + 1);
                }
            }
            while (result >= 10) {
                int nxt = 0;
                while (result > 0) {
                    nxt += result % 10;
                    result /= 10;
                }
                result = nxt;
            }
            return result;
        }


        static class Node {
            int l, r, max = 0;
            Node left, right;

            Node(int l, int r) {
                this.l = l;
                this.r = r;
            }

            void update(int index, int val) {
                if (index > r || index < l) {
                    return;
                }
                if (l == index && index == r) {
                    max = Integer.max(max, val);
                    return;
                }
                if (left == null) {
                    int mid = (l + r) / 2;
                    left = new Node(l, mid);
                    right = new Node(mid + 1, r);
                }
                left.update(index, val);
                right.update(index, val);
                max = Integer.max(left.max, right.max);
            }

            int get(int lt, int rt) {
                if (lt > r || rt < l) {
                    return 0;
                }
                if (lt <= l && r <= rt) {
                    return max;
                }
                if (left == null) {
                    return 0;
                }
                return Integer.max(left.get(lt, rt), right.get(lt, rt));
            }

        }


        public static int[] KMP(String val) {
            int i = 0;
            int j = -1;
            int[] result = new int[val.length() + 1];
            result[0] = -1;
            while (i < val.length()) {
                while (j >= 0 && val.charAt(j) != val.charAt(i)) {
                    j = result[j];
                }
                j++;
                i++;
                result[i] = j;
            }
            return result;

        }

        public static boolean nextPer(int[] data) {
            int i = data.length - 1;
            while (i > 0 && data[i] < data[i - 1]) {
                i--;
            }
            if (i == 0) {
                return false;
            }
            int j = data.length - 1;
            while (data[j] < data[i - 1]) {
                j--;
            }
            int temp = data[i - 1];
            data[i - 1] = data[j];
            data[j] = temp;
            Arrays.sort(data, i, data.length);
            return true;
        }

        public static int digit(long n) {
            int result = 0;
            while (n > 0) {
                n /= 10;
                result++;
            }
            return result;
        }

        public static double dist(long a, long b, long x, long y) {
            double val = (b - a) * (b - a) + (x - y) * (x - y);
            val = Math.sqrt(val);
            double other = x * x + a * a;
            other = Math.sqrt(other);
            return val + other;

        }

        public static class Point implements Comparable<Point> {

            int x;
            int y;

            public Point(int start, int end) {
                this.x = start;
                this.y = end;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Point point = (Point) o;
                return x == point.x &&
                        y == point.y;
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }

            @Override
            public int compareTo(Point o) {
                if (y != o.y) {
                    return Integer.compare(y, o.y);
                }
                return Integer.compare(x, o.x);


            }
        }

        public static class FT {

            long[] data;

            FT(int n) {
                data = new long[n];
            }

            public void update(int index, long value) {
                while (index < data.length) {
                    data[index] += value;
                    index += (index & (-index));
                }
            }

            public long get(int index) {
                long result = 0;
                while (index > 0) {
                    result += data[index];
                    index -= (index & (-index));
                }
                return result;

            }
        }

        public static long gcd(long a, long b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }

        public static long pow(long a, long b) {
            if (b == 0) {
                return 1;
            }
            if (b == 1) {
                return a;
            }

            long val = pow(a, b / 2);
            if (b % 2 == 0) {
                return (val * val) % MOD;
            } else {
                return (val * ((val * a) % MOD)) % MOD;

            }
        }

        static class Scanner {

            BufferedReader br;
            StringTokenizer st;

            public Scanner() throws FileNotFoundException {
                // System.setOut(new PrintStream(new BufferedOutputStream(System.out), true));
                br = new BufferedReader(new InputStreamReader(System.in));
                //br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("input.txt"))));
            }

            public String next() {

                while (st == null || !st.hasMoreTokens()) {
                    try {
                        st = new StringTokenizer(br.readLine());
                    } catch (Exception e) {
                        throw new RuntimeException();
                    }
                }
                return st.nextToken();
            }

            public long nextLong() {
                return Long.parseLong(next());
            }

            public int nextInt() {
                return Integer.parseInt(next());
            }

            public double nextDouble() {
                return Double.parseDouble(next());
            }

            public String nextLine() {
                st = null;
                try {
                    return br.readLine();
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }

            public boolean endLine() {
                try {
                    String next = br.readLine();
                    while (next != null && next.trim().isEmpty()) {
                        next = br.readLine();
                    }
                    if (next == null) {
                        return true;
                    }
                    st = new StringTokenizer(next);
                    return st.hasMoreTokens();
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
        }
    }

