package arrays;

public class FirstMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {-1,1,2,3};
	}
	
	public static int firstMissingPositive(int[] nums) {
        
        int posArraySum = 0;
        int posNumbersCount = 0;
        for(int x: nums)
        {
            if(x > 0)
            {
                posArraySum += x;
                posNumbersCount++;
            }
        }
        
        int integerSum = posNumbersCount * ( posNumbersCount + 1) /2;
        
        if(integerSum - posArraySum ==  0)
            return nums.length;
        else
           return (integerSum - posArraySum);
    }

}
