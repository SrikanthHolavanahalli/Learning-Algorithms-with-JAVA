package PayPal;

public class Participant {

	String name;
	//int i =0; // current x pos
	//int j =0; // current y pos;
	
	public boolean moveDown(int[][] grid, int x, int y){
		return isSafe(grid,x,y) == true?true:false;	
	}
	public boolean moveUp(int[][] grid, int x, int y){
		return isSafe(grid,x,y) == true?true:false;
	}
	public boolean moveRight(int[][] grid, int x, int y){
		return isSafe(grid,x,y) == true?true:false;
	}
	public boolean moveLeft(int[][] grid,int x, int y){
		return isSafe(grid,x,y) == true?true:false;
	}
	
	public boolean isSafe(int[][] grid, int x, int y){
		 if(x<0 || y <0 || x >= grid.length|| y >= grid[0].length)
			 return false;
		 else{
			 display(grid,x,y);
			 return true;
		 }
	}
	
	public void display(int[][] grid,int i, int j){
		//System.out.print(i + " " + j + ":");
		System.out.print(grid[i][j] + " ");
	}
}
