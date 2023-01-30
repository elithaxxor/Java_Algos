public class IndexPairsOfString {
    public int[][] indexPairs(String text, String[] words) {

                if (text.length() >= 100) {
                    return new int [] [] {{-1, -1}};
                }
                int K = words.length;
                int M = text.length();
                char [] t =  text.toCharArray();


                String firstIdx = words[0];
                char firstChar = firstIdx.charAt(0);

                int [][] res = new int [K][K] ;

                for (int i = 0; i < K; i++ ) {
                    String str1 = words[i];
                    char ch1 = words[i].charAt(i);
                    System.out.println("ch1 -> "  + ch1);
                    int p1 = 0; int p2 = text.length()-1;

                }
                return res;

            }
            public static void main(String args[]) {
                String text = "thestoryofleetcodeandme";
                String [] words = new String []{"story", "fleet", "leetcode"};
                IndexPairsOfString id = new IndexPairsOfString();
                id.indexPairs(text, words);

            }
        }