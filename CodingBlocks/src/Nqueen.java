public class Nqueen {
    static int count;
    private static boolean canPlaced(int[][] board, int cr, int cc, int n) {

        for(int row = 0; row <= cr - 1; row++) {
            if(board[row][cc] == 1) {
                return false;
            }
        }

        int row = cr;
        int col = cc;

        //right diagonal
        while(row >= 0 && col < n) {
            if(board[row][col] == 1) {
                return false;
            }
            row--;
            col++;
        }

        row = cr;
        col = cc;

        //left diagonal
        while(row >= 0 && col >= 0) {
            if(board[row][col] == 1) {
                return false;
            }
            row--;
            col--;
        }

        return true;
    }
    private static void sol(int[][] board, int n, int cr) {
        // TODO Auto-generated method stub

        if(cr == n) {
            count++;
            return;
        }
        for(int cc = 0; cc < n; cc++) {

            if(canPlaced(board, cr, cc, n) == true) {
                board[cr][cc] = 1;
                sol(board, n, cr + 1);
                board[cr][cc] = 0;
            }
        }

        return;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 4;

        int[][] board = new int[n][n];
        count = 0;

        sol(board, n, 0);
        System.out.println(count);
    }

}
