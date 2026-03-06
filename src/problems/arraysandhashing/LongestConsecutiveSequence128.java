package problems.arraysandhashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequence128 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longest = 0;
        for (int num: nums) {
          if (set.contains(num-1)) continue;
          int count = 1;
          while(set.contains(num + count)) count++;
          if (count > longest) longest = count;
        }
        return longest;
    }
}
