package graphs;

public class WordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'A','B','C','E'},{'S','F','C', 'S'},{'A', 'D', 'E', 'E'}};
		char[][] board2 = new char[3][3];
		board2[0] = "CAA".toCharArray();
		board2[1] = "AAA".toCharArray();
		board2[2] = "BCD".toCharArray();
		
		String word = "ABCCED";
		String word2 = "AAB";
		System.out.println(exist(board2,word2));
	}
	
	public static boolean exist(char[][] board, String word) {
        if(word==null||board==null||board.length==0)
            return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(bfs(board,word,1,i,j,visited))
                        return true;
                }
            }
        }
        return false;
    }
    
    public static boolean bfs(char[][] board, String word, int index, int i , int j,boolean[][] visited){
        /*if(visited[i][j])
            return false;
        else
            visited[i][j] = true;*/
        int stop=0;
        if(i==1&&j==1&&index==1)
        	stop = 1;
        
        if(index == word.length())
            return true;
        if(j-1>=0 && board[i][j-1] == word.charAt(index) &&  bfs(board,word,index+1,i,j-1,visited))
            return true;
        else if(i-1>=0 && board[i-1][j] == word.charAt(index) && bfs(board,word,index+1,i-1,j,visited))
            return true;
        else if(j+1<board[0].length && board[i][j+1] == word.charAt(index)&&bfs(board,word,index+1,i,j+1,visited))
            return true;
        else if(i+1< board.length && board[i+1][j] == word.charAt(index) && bfs(board,word,index+1,i+1,j,visited))
            return true;
        return false;
    }

}
