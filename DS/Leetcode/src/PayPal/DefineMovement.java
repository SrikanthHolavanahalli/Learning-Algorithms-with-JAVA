package PayPal;

public class DefineMovement implements Movement {

	@Override
	public  void actionParadigm(String input,Participant p,int[][] grid) {
		// TODO Auto-generated method stub
		if(input.equals("Spiral")){
			int rowBegin=0, rowEnd = grid.length-1, colBegin = 0, colEnd = grid[0].length-1;
			//p.display(grid);
			while(rowBegin <= rowEnd && colBegin <= colEnd){
				// right movement
				for(int j = colBegin; j <= colEnd && p.moveRight(grid, rowBegin, j) ;j++){
				}
				rowBegin++;
				for(int i = rowBegin; i <= rowEnd && p.moveDown(grid, i, colEnd);i++){
				}
				colEnd--;
				for(int j = colEnd; j >= colBegin && p.moveLeft(grid, rowEnd, j);j--){
				}
				rowEnd--;
				for(int i = rowEnd; i >= rowBegin && p.moveUp(grid, i, colBegin);i--){
				}
				colBegin++;
			}
		}
	}

	
}
