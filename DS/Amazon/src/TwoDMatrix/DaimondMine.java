package TwoDMatrix;

public class DaimondMine {

	public static int count=0;

	public static boolean hoGya=false;
	public static void main(String[] args) {
		
		int[][]arr={{0,1,-1},{1,0,-1},{1,1,1}};
		int[][]arr1={{0,1,1},{1,0,1},{1,-1,1}};
		
		int result=collect_max(arr1);
		System.out.println(result);
		

	}
	
	static int collect_max(int [][] arr)
	{
		int[][]temp=arr;
		char[][] direc=new char[arr.length][arr.length];
		int going=collect_max_ahead(temp,0,0,direc);
		
		int x=0,y=0;
		
		if(!hoGya)
			return 0;
		for(int i=0;i<(arr.length+arr.length)-1;i++)
		{
			arr[x][y]=0;
			if(direc[x][y]=='d')
			{
				arr[x][y]=0;
				x++;
			}
			else{
				arr[x][y]=0;
				y++;
			}
			
			
		}
		
		
		
		int reverse=collect_max_back(arr,arr.length-1,arr.length-1);
		
		return going+reverse;
	}
	static int collect_max_ahead(int [][] arr,int i,int j,char[][] d)
	{
		if(arr[i][j]==-1)
			return 0;
		int diamond=0;
		
		int down=0,right=0;
		if(arr[i][j]==1)
		{
			diamond=1;
			
		}
	
		if(j<arr.length-1)
			right=collect_max_ahead(arr,i,j+1,d);
		if(i<arr.length-1)
			down=collect_max_ahead(arr,i+1,j,d);
		
		char c='f';
		if(right<=down)
			c='d';
		else
			c='r';
		d[i][j]=c;
		
		if( i==arr.length-1 && j==arr.length-1 && arr[i][j]==1)
		{
			hoGya=true;
		}
		
		return diamond+ Math.max(right, down);
	}
	
	static int collect_max_back(int[][] arr,int i,int j)
	{
		if(arr[i][j]==-1)
			return 0;
		int diamond=0;
		if(arr[i][j]==1)
		{
			diamond=1;
		
		}
		int up=0,left=0;
		if(i>0)
			left=collect_max_back(arr,i-1,j);
		if(j>0)
			up=collect_max_back(arr,i,j-1);
	
		return diamond+Math.max(left, up);
	}
	

}

class Comparator{

	public boolean compare(int a,int b)
	{
		return a==b;
		
	}
	
	public boolean compare(String a,String b)
	{
		return a.equals(b);
		
	}
	
	public boolean compare(int[] a,int[] b)
	{
		if(a.length!=b.length)
			return false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
				return false;
		}
		return true;
		
	}


}
