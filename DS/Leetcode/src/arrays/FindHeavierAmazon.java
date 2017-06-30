package arrays;

public class FindHeavierAmazon {

	
	
	// Assumption 2 - input array with 11 coins weight
	static double[] input = {1,1.1,1,1,1,1,1,1,1,1,1}; // globalizing the array for accesing across all functions

//driver program
public static void main(String[] args)
{
    int low = 0 ; //low denotes the start index of the coins to be weighed
    int high = input.length - 2; //high denotes the end index of the coins to be weighed
    
    //printing the index of heavier coin
    System.out.println(findHeavier(low,high));
    
}     

//Main function which splits array and sends it to wieghing function
public static int  findHeavier(int low, int high)
{   
     if(low >= high)
        return low; // single element
    
     int mid = (low+high)/2;
     int result = weighingScale( low,mid,mid+1,high); //outcome of wighing scale
     int resultIndex = 0; // index of heavier coin
     
     if(result == 0)
        return high+1; // returning index
     else if( result == 1)
        resultIndex = findHeavier(low,mid-1);   //left side of balance
     else 
        resultIndex = findHeavier(mid+1,high-1);  //right side of balance
        
     return resultIndex;
}


// if both weights are equal, return 0, else 1 if left side is heavier, 2 if right side is heavier
public static int weighingScale(int startIndexLeft, int endIndexLeft, int startIndexRight, int endIndexRight)
{
    // assumption 1 -  totalweight function knows the total weight from start index to end index
	
	System.out.println(startIndexLeft + " "  + endIndexLeft + " "+ totalweight(startIndexLeft,endIndexLeft));
	System.out.println(startIndexRight + " " + endIndexRight + " "+ totalweight(startIndexRight,endIndexRight));
	
    if(totalweight(startIndexLeft,endIndexLeft) == totalweight(startIndexRight,endIndexRight))
        return 0;
    else
       return totalweight(startIndexLeft,endIndexLeft) > totalweight(startIndexRight,endIndexRight)?1:2;
}

public static double totalweight(int l, int r)
{
	double sum = 0;
	while(l <= r)
		sum += input[l++];
	
	return sum;
}	

}
