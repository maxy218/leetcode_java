
public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(str == null || str.length() == 0)
    		return 0; // in fact, I should throw an exception
    	
        long ans = 0;
        int ifNeg = 1;
        int len = str.length();
        int idx = 0;
        while(str.charAt(idx) == ' '){
        	++idx;
        }
        
        if(idx >= len)
        	return 0; // in fact, I should throw an exception.
        
        if(str.charAt(idx) == '-'){
        	ifNeg = -1;
        	++idx;
        }
        else if(str.charAt(idx) == '+'){
        	++idx;
        }
        
        final int MAXINT = 0x7fffffff;
        final int MININT = 0x80000000;
        
        while(idx < len && str.charAt(idx) >= '0' && str.charAt(idx) <= '9'){
        	ans = ans*10 + str.charAt(idx) - '0';
        	if(ifNeg == 1 && ans >= MAXINT)
        		return MAXINT;
        	else if(ifNeg == -1 && -ans < MININT)
        		return MININT;
        	++idx;
        }
        
        return (int)ans*ifNeg;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.atoi("010"));
		
	}

}
