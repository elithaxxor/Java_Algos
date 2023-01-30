public class IndexPairsString {
        public int[][] indexPairs(String text, String[] words) {

            int K = words.length;
            int M = text.length();
            char [] t =  text.toCharArray();


            String firstIdx = words[0];


            int [] [] res = new int [] []{{0, 0}};

            for (int i = 1; i < K; i++ ) {
                char ch = firstIdx.charAt(i);
                System.out.println("ch " +  ch);
                for(int j = 0; j < words[j].length(); j++ ) {
                    char ch2 = words[i].charAt(j);
                    System.out.println("ch2 -->  " +  ch2);
                }
            }

            return res;
        }
    }


