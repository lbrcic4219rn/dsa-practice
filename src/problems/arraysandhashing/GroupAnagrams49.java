package problems.arraysandhashing;

import java.util.*;


/*
* Time: O(N * M) M length of the longest string
*
* */

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for(String s: strs) {
            int[] key = new int[26];
            for(char c: s.toCharArray()) {
                key[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int k: key){
                sb.append(k).append(",");
            }
            groups.computeIfAbsent(sb.toString(), _ -> new ArrayList<>()).add(s);
        }

        return groups.values().stream().toList();
    }
}
