package problems.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int low = 0;
        int maxLen = 0;

        for (int high = 0; high < s.length(); high++) {
            if(mp.containsKey(s.charAt(high))) {
                low = Math.max(mp.get(s.charAt(high)) + 1, low);
            }
            mp.put(s.charAt(high), high);
            maxLen = Math.max(maxLen, high - low + 1);
        }
        return maxLen;
    }
}