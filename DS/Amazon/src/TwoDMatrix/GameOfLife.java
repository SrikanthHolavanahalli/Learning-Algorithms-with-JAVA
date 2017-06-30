package TwoDMatrix;

public class GameOfLife {

	static int[][] matrix = {{1,0,1,1},{1,0,0,1},{0,0,0,1},{0,0,1,1}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UpdateState();
		gameOfLife(matrix);
	}
	
	public static void gameOfLife(int[][] board) {
        if(board==null || board.length ==0)
            return;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                int count = countNeighbors(board,i,j);
                if(board[i][j] == 1 && count >=2 && count<=3)
                    board[i][j] = 3;
                else if(board[i][j] == 0 && count ==3)
                    board[i][j] = 2;
            }
        }
         for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                board[i][j] >>= 1;
            }
         }
    }
    public static int countNeighbors(int[][] board, int x , int y){
        int count = 0;
        for(int i = Math.max(x-1,0);i < Math.min(board.length, x+1); i++){
           for(int j = Math.max(y-1,0);j < Math.min(board[0].length, y+1); j++){
                //if(i==x&&j==y) continue;
                count += board[i][j] & 1;
            } 
        }
        count -= board[x][y] & 1;
        return count;
    }
	
	/*
	public static void UpdateState(){
		int m = matrix.length, n = matrix[0].length,lives=0;
		for(int i = 0;i <m;i++){
			for(int j = 0;j <n;j++){
				lives = countNeighbors(m,n,i,j);
				if(matrix[i][j] ==1 && lives>=2 && lives<=3){
					matrix[i][j] = 3;
				}
				if(matrix[i][j] ==0 &&  lives==3 ){
					matrix[i][j] = 2;
				}
			}
		}
		for(int i = 0;i <m;i++){
			for(int j = 0;j <n;j++){
				matrix[i][j] >>= 1;
			}
		}
		int x = 1;
		x++;
	}
	public static int countNeighbors(int m, int n, int i, int j){
		int lives =0 ;
		for(int x = Math.max(i-1, 0); x <= Math.min(i+1,m-1); x++){
			for(int y = Math.max(j-1, 0); y <= Math.min(j+1,n-1); y++){
				lives+=matrix[x][y] & 1;
			}
		}
		lives -= matrix[i][j] & 1;
	    return lives;
	}
*/
}
