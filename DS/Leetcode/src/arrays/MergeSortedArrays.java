package arrays;

public class MergeSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,3,5,0,0,0};
		int[] nums2 = {2,4,6};
		merge(nums1,3,nums2,3);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1==null || nums2 == null || m==0 || n==0)
            return;
        int k = m+n-1,j = n-1,i=m-1;
        while(i >=0 && j>=0){
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }
        while(j >= 0 && k >= 0)
            nums1[k--] = nums2[j--];
    }

}
