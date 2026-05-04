package problems.heappriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> distances = new PriorityQueue<>(Comparator.comparing(a -> a[0]));
        for (int[] point : points) {
            int distance = point[0] * point[0] + point[1] + point[1];
            distances.add(new int[]{ distance, point[0], point[1] });
        }
        int[][] res = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] point = distances.poll();
            res[i] = new int[]{ point[1], point[2] };
        }
        return res;
    }
}
