
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] tmp = new int[m + n];
        int i = 0; int j = 0;
        while(i < m && j < n){
        	if(A[i] < B[j]){
        		tmp[i + j] = A[i++];
        	}
        	else{
        		tmp[i + j] = B[j++];
        	}
        }
        while(i < m)
        	tmp[i + j] = A[i++];
        while(j < n)
        	tmp[i + j] = B[j++];
        for(i = 0; i < m + n; ++i){
        	A[i] = tmp[i];
        }
    }
	   
    private void outputArray(int[] array){
    	for(int i = 0; i < array.length; ++i){
    		System.out.print(array[i] + ", ");
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		a[0] = 1; a[1] = 2; a[2] = 3; 
		int b[] = {2,5,6};
		Solution s = new Solution();
		s.merge(a, 3, b, 3);
		s.outputArray(a);
	}

}
