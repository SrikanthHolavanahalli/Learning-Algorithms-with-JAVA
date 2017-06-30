package array;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input = {{1,2,3,4,5},
						 {6,7,8,9,10},
						 {11,12,13,14,15},
						 {16,17,18,19,20},
						 {21,22,23,24,25}};
		rotateMatrix(input);
		
	}
	public static void rotateMatrix(int[][] matrix){
		int m = matrix.length-1;
		int n = matrix[0].length-1;
		int temp = 0;
		for(int i = 0; i < m/2; i++){
			for(int j = i; j<= n-2-i; j++){
				temp = matrix[i][j];
				matrix[i][j]= matrix[j][n-i];
			    matrix[j][n-i] = matrix[n-i][n-j];
				matrix[n-i][n-j]= matrix[n-j][i];
				matrix[n-j][i]= temp;
			}
		}
		for(int i = 0; i <= m; i++){
			for(int j = 0; j<= n; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
