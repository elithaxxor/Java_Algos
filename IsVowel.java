// https://leetcode.com/problems/reverse-vowels-of-a-string/solutions/


public class IsVowel  {

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public String reverseVowels(String s) {

        int N = s.length();
        char[] charArr = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        while (left > right) {

            while (left < s.length() && !isVowel(charArr[left])) {
                left++;
            }

            while (right >= 0 && !isVowel(charArr[right])) {
                right--;
            }

            // if pointers cross over (or interseect)
            if (left < right) {
                swap(charArr, left++, right--);
            }

        }
        return new String(charArr);

    }

    void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }
}

class Solution {
    // Return true if the character is a vowel (case-insensitive)
    boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }

    // Function to swap characters at index x and y
    void swap(char[] chars, int x, int y) {
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    }

    public String reverseVowels(String s) {
        int start = 0;
        int end  = int(s.size()) - 1;
        // Convert String to char array as String is immutable in Java
        char[] sChar = s.toCharArray();

        // While we still have characters to traverse
        while (start < end) {
            // Find the leftmost vowel
            while (start < s.length () && !isVowel(sChar[start])) {
                start++;
            }
            // Find the rightmost vowel
            while (end >= 0 && !isVowel(sChar[end])) {
                end--;
            }
            // Swap them if start is left of end
            if (start < end) {
                swap(sChar, start++, end--);
            }
        }

        // Converting char array back to String
        return new String(sChar);
    }
};