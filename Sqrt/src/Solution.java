
public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(x == 0) return 0;
        double result = x;
        double preResult = x + 1;
        double epsilon = 1e-2;
        while(Math.abs(result - preResult) > epsilon){
        	preResult = result;
        	result = ((double)x/result + result)/2;
        }
        return (int)result;
    }
    
    public int sqrt_v2(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	double l = 0; double r = x;
    	double epsilon = 1e-6;
    	while(l < r){
    		double mid = l + (r - l)/2;
    		if(mid*mid > x + epsilon)
    			r = mid;
    		else if(mid * mid < x - epsilon)
    			l = mid;
    		else return (int)(mid + epsilon);
    	}
    	return (int)(l+ epsilon);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		
//		System.out.println(s.sqrt(0));
//		System.out.println(s.sqrt(1));
//		System.out.println(s.sqrt(2));
//		System.out.println(s.sqrt(4));
//		System.out.println(s.sqrt(131));
//		System.out.println(s.sqrt(143));
		System.out.println(s.sqrt(2147395599));
		
//		System.out.println(s.sqrt_v2(0));
//		System.out.println(s.sqrt_v2(1));
//		System.out.println(s.sqrt_v2(2));
//		System.out.println(s.sqrt_v2(4));
//		System.out.println(s.sqrt_v2(131));
//		System.out.println(s.sqrt_v2(143));
		System.out.println(s.sqrt_v2(2147395599));
	}

}
