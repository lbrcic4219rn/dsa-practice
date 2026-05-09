package problems.d1dynamicprogramming;

public class PalindromicSubstrings647 {
    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += countPalindromes(s, i, i) + countPalindromes(s, i, i + 1);
        }
        return res;
    }

    private int countPalindromes(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++;
            l--;
            r++;
        }
        return count;
    }
}


