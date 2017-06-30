import java.util.ArrayList;
import java.util.HashSet;

public class CharLenMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String start = "ACTT"; 
		String end = "GCTA";
		
		
		String[] bank = {"GCTT","GCTA"};
		
		
		System.out.println(findMutationDistance(start,end,bank));
		
	}

	
	
	
	public static int findMutationDistance(String start, String end, String[] bank)
	{
		HashSet<String> bankStore = new HashSet<String>();
		
		for(String s : bank)
		{
			bankStore.add(s);
		}
		
		
		int[][] DPStore = new int[start.length()+1][end.length()+1] ;
		
		
		
		for(int i = 1; i < start.length() + 1 ; i++ )
		{
			for(int j = 1; j < end.length() + 1  ; j++ )
			{
				if(start.charAt(i-1)==end.charAt(j-1))
				{
					DPStore[i][j] = DPStore[i-1][j-1];
				}
				else
				{
					DPStore[i][j] = Math.min( DPStore[i-1][j-1] +1  ,Math.min(DPStore[i-1][j] + 1, DPStore[i][j-1] + 1));
				}
				
				if(i==j)
				{
					if(DPStore[i][j] > DPStore[i-1][j-1])
					{
						String temp = start.substring(0, i-1) + end.charAt(j-1) + start.substring(i);
						start=temp;
						if(!bankStore.contains(temp))
						{
							return -1;
						}
					}
				}
				
			}
			
			
		}
		
		return DPStore[start.length()][end.length()];
	}
	
	
}
