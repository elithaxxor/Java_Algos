import java.util.Arrays;

public class FlipAndInvertImage {
    int R;
    int C;
    int end;
    int [][] res ;
    public int[][] flipAndInvertImage(int[][] image) {
        int r = image.length;
        int c = image[0].length;
        R = c-1;
        C = image[0].length -1;
        end = R*C -1;
        res = new int[R] [C];


        System.out.println((c+1)/2);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                invert(image, r, c);

            }
        }
        return image;
    }

    public void invert(int [][] image, int r, int c) {

        if (r < 0 || c < 0  || c >= C || r >= R ) {
            return;
        }
        if(image[r][c] == 1) {
            image[r][c] = 0;
        } else {
            image[r][c] = 1 ;
        }
        invert(image, r+1, c-1);
    }
}










class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int N = g.length;
        int M = g.length;

        int sum = 0;
        int count = 0;
        for(int i = N-1; L >= 0 && j >= 0 ; i--) {
            sum-= s[i];
            while(g[i] - s[i] > 0 ) {
                count++ ;
                L--;
            }

        }

        return count;
    }
}

