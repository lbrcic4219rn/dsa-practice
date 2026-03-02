package problems.arraysandhashing;

import java.util.*;


/*
* Time: O(N * M) M length of the longest string
*
* */

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
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

    public static void main(String[] args) {
        String[] input = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(input));
    }

    //3859
}
