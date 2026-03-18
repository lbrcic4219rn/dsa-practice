package problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement424 {
    public int characterReplacement(String s, int k) {
        int l = 0;
        Map<Character, Integer> count = new HashMap<>();
        count.put(s.charAt(l), 1);
        int maxf = 1; //ponavljanje
        int maxLen = 1; //najduze

        for(int i = l + 1; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
            maxf = Math.max(count.get(s.charAt(i)), maxf);
            if(i - l < maxf + k) {
                maxLen = Math.max(maxLen, i - l + 1);
                continue;
            }
            count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
            l++;
        }
        return maxLen;
    }
}
