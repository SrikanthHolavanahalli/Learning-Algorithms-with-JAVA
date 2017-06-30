package TwoDMatrix;

public class SetZeroes {
	
	static int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setZeroes(matrix);
		
	}
	
	public static void setZeroes(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return;
        boolean zeroColHasZero=false, zeroRowHasZero=false;
        //check if 0th col has zero
        for(int i = 0 ; i < matrix.length; i++){
            if(matrix[i][0]==0){
                zeroColHasZero = true;
                break;
            }
        }
        //check if 0th row has zero
        for(int j = 0 ; j < matrix[0].length; j++){
            if(matrix[0][j]==0){
                zeroRowHasZero = true;
                break;
            }
        }
        //starting from 1,1 to end, mark which row,col as 0 if i,j=0
        for(int i = 1 ; i < matrix.length; i++){
            for(int j = 1 ; j < matrix[0].length; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(int i = 1 ; i < matrix.length; i++){
            if(matrix[i][0]==0){
                for(int j = 1 ; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1 ; j < matrix[0].length; j++){
            if(matrix[0][j]==0){
                for(int i = 1 ; i < matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
        if(zeroColHasZero == true){
            for(int i = 0 ; i < matrix.length; i++)
                matrix[i][0]=0;
        }
        if(zeroRowHasZero == true){
            for(int j = 0 ; j < matrix[0].length; j++)
                matrix[0][j]=0;
        }
        
        int x = 1;
        
    }


}
