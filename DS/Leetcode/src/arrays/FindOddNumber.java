package arrays;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,1,2,3,3};
		System.out.println(findOddNumber(input));
	}
	
	public static  int findOddNumber(int[] input)
    {
        int result = input[0];
        
        //iterate over other elements and xor with result
        for(int i = 1; i < input.length; i++)
        {
            result = result ^ input[i];
        }
        return result;
    }
}
