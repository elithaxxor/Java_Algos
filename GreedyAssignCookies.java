import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int S = s.length-1;
        int G = g.length-1;

        int sum = 0;
        int count = 0;
        for(int i = g.length-1, R=s.length-1; i >= 0 &&  R >= 0 ; i--) {
            if(s[i] >= g[R] ) {
                count++ ;
                R--;
            }
        }

        return count;
    }
}



class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=g.length-1,j=s.length-1; j>=0 && i>=0 ;i--)
        {
            if(s[j]>=g[i])
            {
                count++;
                j--;
            }
        }
        return count;
    }
}
