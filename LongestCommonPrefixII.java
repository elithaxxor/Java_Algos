import java.util.*;
// https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefixII {

        public String longestCommonPrefix(String[] strs) {

            String string = strs.toString(); // transforms arry to string
            HashMap<Integer, String> freqMap = new HashMap<Integer, String>();  // freq map
            String prefix  = strs[0]; // sets prefix


            /* base case */
            if (strs.length == 0 || strs == null) {
                return "";
            }



            int left = 0;
            int right = strs.length;


            for (int i = 0; i < strs.length; i++) {

                while(strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length()- 1 );
                    if (prefix.isEmpty()) { return ""; }
                }
            }
            System.out.print("prefix" + prefix);
            return prefix;
        }
    }



