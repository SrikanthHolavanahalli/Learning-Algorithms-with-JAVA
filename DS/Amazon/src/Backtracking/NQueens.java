package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		List<List<String>> result = solveNQueens(n);
	}
	
	 public static List<List<String>> solveNQueens(int n) {
	        List<List<String>> result = new ArrayList<List<String>>();
	        if(n<1)
	            return result;
	        solve(result,new ArrayList<String>(), n,0,new boolean[n], new boolean[2*n], new boolean[2*n]);
	        return result;
	    }
	    public static void solve(List<List<String>> result, List<String> cur, int n, int rowNum, boolean[] col, boolean[] diag1, boolean[] diag2){
	        if(rowNum == n){
	            result.add(new ArrayList<String>(cur));
	            return;
	        }
	        for(int j=0;j<n;j++){
	            int d1 = rowNum+j;
	            int d2 = j-rowNum + n-1;
	            if(!col[j] && !diag1[d1] && !diag2[d2]){
	                col[j]=true;
	                diag1[d1] = true;
	                diag2[d2] = true;
	                
	                char[] rowDots = new char[n];
	                Arrays.fill(rowDots,'.');
	                rowDots[j] = 'Q';
	                cur.add(new String(rowDots));
	                
	                solve(result,cur, n,rowNum+1,col,diag1,diag2);
	                
	                col[j]=false;
	                diag1[d1] = false;
	                diag2[d2] = false;
	                
	                cur.remove(cur.size() - 1);
	            }
	        }
	    }
	
	

}
