package PayPal;

public class Driver {
	
	static int[][] grid = {{1,  2 , 3 , 4},{12 ,13,  14 ,5},{11, 16,  15, 6},{10,  9 , 8 , 7}};

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		String paradigm  = "Spiral";
		Participant a = new Ant();
		DefineMovement d = new DefineMovement();
		d.actionParadigm(paradigm,a,grid);
	}
	

}
