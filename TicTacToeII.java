class SolutionIII {
    int N = 3;
    char[][] board = new char[N][N];
    char p1 = 'X';
    char p2 = 'O';

    public String tictactoe(int[][] moves) {


        int movesLeft = 9, count = 0;
        for (int[] move : moves) {
            int n = moves.length;
            int r = move[0];
            int c = move[1];
            int end = n - 1;


            System.out.println("r " + r);
            System.out.println("c " + c);

            // todo: create another board to cross reference preveious moves
            board[r][c] = p1;
            count++;
            while (movesLeft >= 0
                    || checkHorizontal(r, c)
                    || checkVerticle(r,c)
                    || checkDiagonal(r, c)
                    || checkExdiagonal(r, c)
            ){
                if (count % 2 == 0) {
                    board[r][c] = p2;
                    movesLeft--;
                } else {
                    board[r][c] = p1;
                    movesLeft--;
                }

                // mark : traverse array, check 
            }

        }
        return "Pending";
    }

    // mark: traverse diag / horizontal (3x3) grid 

    public boolean checkHorizontal(int r, int c) {
        for (int i = 0; i < N; i++) {
            if (board[0][c] == 'X' || board[0][c] == 'O') {
                return true;
            }
        }
        return false;
    }

    public boolean checkVerticle( int r, int c) {
        for (int j = 0; j < N; j ++) {
            if(board[j][0] == 'X' || board[j][0] == 'O') {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonal( int r, int c) {
        for (int i = 0; i < N; i++) {
            char [] mid  = board[N-1-i];
            return false;
        }
        return true;
    }



    public boolean checkExdiagonal ( int r, int c){
        for(int i = 0; i < N; i++ ) {
            return false;
        }
        return true;
    }

}