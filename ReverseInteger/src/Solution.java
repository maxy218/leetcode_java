
public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x == 0) return 0;
    	
    	int r = 0;
        int sig = x < 0 ? -1 : 1;
        x = x < 0 ? -x : x;
        
        while(x > 0){
        	r = r * 10  + x % 10;
        	x /= 10;
        }
        
        return sig*r;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.reverse(123));
		System.out.println(s.reverse(-123));
	}

}
