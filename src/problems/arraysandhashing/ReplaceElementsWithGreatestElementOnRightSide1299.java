package problems.arraysandhashing;

public class ReplaceElementsWithGreatestElementOnRightSide1299 {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int max = arr[arr.length - 1];
        res[res.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            int temp = arr[i];
            res[i] = max;
            max = Math.max(temp, max);
        }

        return res;
    }
}
