package problems.binarysearch;

public class SearchA2DMatrix74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int col = matrix[0].length;
        final int row = matrix.length;

        int l = 0;
        int r = col * row - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int i = mid / col;
            int j = mid % col;
            if(matrix[i][j] < target) l = mid + 1;
            else if (matrix[i][j] > target) r = mid - 1;
            else return true;
        }

        return false;
    }
}
