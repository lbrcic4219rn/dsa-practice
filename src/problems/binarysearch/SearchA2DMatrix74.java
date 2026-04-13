package problems.binarysearch;

public class SearchA2DMatrix74 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[0].length;

        while (l < r) {
            int mid = l + (l + r) / 2;
            int i = mid / matrix.length;
            int j = mid % matrix.length;
            if(target == matrix[i][j]) {
                return true;
            }

            if(target > matrix[i][j]) l = mid + 1;
            else r = mid;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{
                {1,2,4,8},
                {10,11,12,13},
                {14,20,30,40}
        }, 15));
    }
}
