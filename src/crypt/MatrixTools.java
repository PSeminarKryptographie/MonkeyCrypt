package crypt;


public class MatrixTools {
	public static int[][] mulMatrix(int[][] a, int[][] b) {
		
		int rows1 = a.length;
        int columns1 = a[0].length;
        int rows2 = b.length;
        int columns2 = b[0].length;
        if (columns1 != rows2) throw new RuntimeException("Illegal matrix dimensions.");
        int[][] c = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < columns2; j++)
                for (int k = 0; k < columns1; k++)
                    c[i][j] += a[i][k] * b[k][j];
        return c;
        
    }
	
 public static int[][] modMatrix (int [][] matrix, String alpha){
	 
	 int rows = matrix.length;
	 int columns = matrix[0].length;
	 int [][] newMatrix = new int [rows][columns];
	 for (int i = 0; i < rows; i++){
		 for (int n = 0; n < columns; n++){
			 int field = ((matrix[i][n])%(alpha.length())+ (alpha.length()))%alpha.length();
			 newMatrix[i][n] = field;
		 }
	 }
	 return newMatrix;
 }
	public static int determinant(int[][] matrix) {
		if (matrix.length == 1)
			return matrix[0][0];
		if (matrix.length == 2)
			return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

		int determinant = 0;
		for (int i = 0; i < matrix.length; i++){
			determinant += Math.pow(-1, i) * matrix[0][i]* determinant(minor(matrix, 0, i));
		}
		return determinant;
}
	private static int[][] minor(int[][] matrix, int row, int column) {
		int[][] minor = new int[matrix.length - 1][matrix.length - 1];

		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; i != row && j < matrix.length; j++){
				if (j != column){
					minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix[i][j];
				}
			}
		return minor;
}
	public static int[][] inverse(int[][] matrix, String alpha) {
		int[][] inverse = new int[matrix.length][matrix.length];

		
		// minors and cofactors
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++){
				inverse[i][j] = (int) Math.pow(-1, i + j) * determinant(minor(matrix, i, j));
			}
		}
		
		// adjugate and determinant
		
		int determinant = Tools.modInverse(determinant(matrix), alpha);
		for (int i = 0; i < inverse.length; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = inverse[i][j];
				inverse[i][j] = inverse[j][i] * determinant;
				inverse[j][i] = temp * determinant;
			}
		}

		return modMatrix(inverse, alpha);
	}
}
