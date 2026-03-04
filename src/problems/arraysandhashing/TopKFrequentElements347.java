package problems.arraysandhashing;

import java.util.*;

public class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            int count = freq.computeIfAbsent(num, key -> 0);
            freq.put(num, count + 1);
        }

        freq.forEach((key, value) -> {
            if(bucket[value] == null){
                bucket[value] = new ArrayList<>();
                bucket[value].add(key);
            } else {
                bucket[value].add(key);
            }
        });

        List<Integer> result = new ArrayList<>();

        for (int i = nums.length; i > 0; i--) {
            if(k <= 0) break;
            if(bucket[i] == null) continue;
            result.addAll(bucket[i]);
            k -= bucket[i].size();
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
