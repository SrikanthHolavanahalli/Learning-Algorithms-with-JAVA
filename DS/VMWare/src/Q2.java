
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp[] = {"a","b","c"};
		divide(4,0);
		
		String IP = "123";
		
		boolean valid = IP.matches("\\b(1?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\b");
		
		System.out.println(valid);
		
	}
	
	
	
	public static void divide(int a ,int b)
	{
		try{
			int c = a/b;
		}
		catch(Exception e){
			System.out.println("Exception");
		}finally{
			System.out.println("finally");
		}
	}

}
