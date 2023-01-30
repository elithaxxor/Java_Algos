
// https://leetcode.com/problems/diagonal-traverse/
// https://www.youtube.com/watch?v=ZaTWa5s1ndI&list=PL1MJrDFRFiKaqGdb3lM27Bqk5EKpVm2-r&index=2
// diagonal matrix traversal.
// odd col indcates shift right, even indicates shift down.


public class FindDiagonalOrder {

    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;

        int R = mat.length - 1;
        int C = mat[0].length - 1;

        int[] res = new int[r * c];
        int idx = 0;
        int x = 0, y = 0;

        while (x<c && y < r) {
            int sum = y + x;
            boolean up = true;
            if (up) {
                while (x > C && y >0) { //mark move right and down.
                    res[idx] = mat[y][x];
                    x++;
                    y--;
                }
                res[idx++] = mat[y][x];
                if (x < C) {
                    x++;
                } else {
                    y++;
                }
            } else { // if odd, go  down,

                while (y < R && x > 0) {
                    res[idx] = mat[y][x];
                    x++;
                    y--;
                }
                res[idx++] = mat[y][x];
                if (y == R) {
                    x++;
                } else {
                    y++;
                }
                up = !up;

            }
        }
        return res;
    }




        public static void main(String[] args) {
            FindDiagonalOrder ip = new FindDiagonalOrder();
        int[] []arg = new int [][]{{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        int [] r = ip.findDiagonalOrder(arg);
        System.out.println("res -> " + r);
    }
}

