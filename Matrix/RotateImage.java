public class RotateImage {
    public void rotate(int[][] matrix) {
      int n = matrix.length;
  
      // Transpose the matrix (swap rows and columns)
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }
  
      // Reverse each row of the transposed matrix
      for (int row = 0; row < n; row++) {
        for (int col = 0; col < n / 2; col++) {
          int temp = matrix[row][col];
          matrix[row][col] = matrix[row][n - col - 1];
          matrix[row][n - col - 1] = temp;
        }
      }
    }
  }
  