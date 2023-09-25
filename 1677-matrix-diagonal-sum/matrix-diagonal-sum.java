class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // Iterate through the matrix
        for (int i = 0; i < n; i++) {
            // Add the element at the primary diagonal
            sum += mat[i][i];

            // Add the element at the secondary diagonal (excluding primary diagonal elements)
            int j = n - i - 1;
            if (i != j) {
                sum += mat[i][j];
            }
        }

        return sum;
    }
}

