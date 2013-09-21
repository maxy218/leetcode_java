
public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function        
    	StringBuffer result = new StringBuffer(s);
    	if(nRows == 1) return result.toString();
    	
    	int cnt = 0;
    	int len = s.length();
    	int step = 2*nRows - 2;
    	
    	// first line
    	for(int i = 0; i < len; i += step){
    		result.setCharAt(cnt++, s.charAt(i));
    	}
    	for(int row = 1; row < nRows - 1; ++row){
    		for(int i = 0; row + i*step < len; ++i){
        		result.setCharAt(cnt++, s.charAt(row + i*step));
        		if((2*nRows - 2 - row) + i*step < len){
        			result.setCharAt(cnt++, s.charAt((2*nRows - 2 - row) + i*step));
    			}
        	}
    	}
    	for(int i = nRows - 1; i < len; i += step){
    		result.setCharAt(cnt++, s.charAt(i));
    	}
    	return result.toString();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.convert("PAYPALISHIRING", 3));
		System.out.println(s.convert("ABC", 3));
	}

}
