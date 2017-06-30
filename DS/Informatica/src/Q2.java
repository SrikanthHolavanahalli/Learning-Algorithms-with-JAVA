
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strongRelation(4,6));
	}
	
	
	static long strongRelation(int n , int m)
	{
		
		long runner = n;
		
		while( runner + (runner * (runner - 1) / 2 ) >= m )
		{
				runner--;
		}
		
		return runner;
		
	}

}
