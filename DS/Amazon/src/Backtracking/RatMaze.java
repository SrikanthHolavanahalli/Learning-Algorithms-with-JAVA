package Backtracking;


public class RatMaze {
	static int n = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RatMaze rat = new RatMaze();
	        int maze[][] = {{1, 0, 0, 0},
	            {1, 1, 0, 1},
	            {0, 1, 0, 0},
	            {1, 1, 1, 1}
	        };
	       n = maze.length;
	       
	       solveMaze(maze);
	}
	
	public static void solveMaze(int[][] maze){
		int[][] sol = new int[n][n];
		boolean result = solevMazeUtil(maze,0,0,sol) ;
		System.out.println(result);
		printSolution(sol);
	}
	
	public static boolean solevMazeUtil(int[][] maze, int x, int y, int[][]sol){
		if(x == n-1 && y ==n-1 && maze[x][y]==1){
			sol[x][y] =1;
			return true;
		}
		if(isSafe(maze,x,y)){
			sol[x][y]=1;
			if(solevMazeUtil(maze,x+1,y,sol)==true)
				return true;
			if(solevMazeUtil(maze,x,y+1,sol)==true)
				return true;
			sol[x][y] =0;
			return false;
		}	
		return false;
	}
	
	public static boolean isSafe(int[][] maze, int x, int y){
		return x>=0 && x < n && y>=0 && y < n && maze[x][y]==1;
	}
	
	public static void printSolution(int sol[][])
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(" " + sol[i][j] +  " ");
            System.out.println();
        }
    }

}
