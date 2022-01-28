package CodingBlocks.src;
import java.io.*;
import java.io.IOException;
import java.util.InputMismatchException;

public class K_Ordered_LCS {
    public static void main(String args[] ) throws Exception {

        int n=i();
        int m=i();
        int k=i();
        int a[]=new int[n];
        int b[]=new int[m];

        for(int i=0;i<n;i++)
            a[i]=i();

        for(int i=0;i<m;i++)
            b[i]=i();


        long dp[][][]=new long[n+1][m+1][k+1];
        for(int i=0;i<dp.length;i++)
            for(int j=0;j<dp[i].length;j++)
                for(int l=0;l<dp[i][j].length;l++)
                    dp[i][j][l]=-1;

        long ans=solve(a,b,n,m,k,dp);
        System.out.println(ans);
        //out.close();
    }


    public static long solve(int a[],int b[],int n,int m,int k,long dp[][][])
    {
        if(n==0||m==0)
            return 0;

        if(dp[n][m][k]!=-1)
            return dp[n][m][k];
        long op1=0;
        long op2=0;

        if(a[n-1]==b[m-1])
            op1= 1+solve(a,b,n-1,m-1,k,dp);
        else
        {
            op1=Math.max(solve(a,b,n-1,m,k,dp),solve(a,b,n,m-1,k,dp));
            if(k>0)
                op2=1+solve(a,b,n-1,m-1,k-1,dp);
        }

        return dp[n][m][k]=Math.max(op1,op2);

    }

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out= new PrintWriter(System.out);

    static class InputReader {

        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, snumChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int snext()
        {
            if (snumChars == -1)
                throw new InputMismatchException();
            if (curChar >= snumChars) {
                curChar = 0;
                try {
                    snumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (snumChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int nextInt()
        {
            int c = snext();
            while (isSpaceChar(c))
            {
                c = snext();
            }
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = snext();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong()
        {
            int c = snext();
            while (isSpaceChar(c))
            {
                c = snext();
            }
            int sgn = 1;
            if (c == '-')
            {
                sgn = -1;
                c = snext();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = snext();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n)
        {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextInt();
            }
            return a;
        }

        public long[] nextLongArray(int n)
        {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
            {
                a[i] = nextLong();
            }
            return a;
        }


        public String nextLine()
        {
            int c = snext();
            while (isSpaceChar(c))
                c = snext();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = snext();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public boolean isSpaceChar(int c)
        {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c)
        {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter
        {
            public boolean isSpaceChar(int ch);
        }

    }

    static int i()
    {
        return sc.nextInt();
    }
    static long l(){
        return sc.nextLong();
    }
    static int[] iarr(int n)
    {
        return sc.nextIntArray(n);
    }
    static long[] larr(int n)
    {
        return sc.nextLongArray(n);
    }
    static String s(){
        return sc.nextLine();
    }
}
