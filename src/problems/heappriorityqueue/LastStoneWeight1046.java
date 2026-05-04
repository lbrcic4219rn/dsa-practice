package problems.heappriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if (stone1 == stone2) continue;

            maxHeap.add(Math.abs(stone1 - stone2));
        }
        return maxHeap.peek() != null ? maxHeap.peek() : 0;
    }
}
