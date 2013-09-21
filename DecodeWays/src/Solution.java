
public class Solution {
	private static boolean ifValidTwoChar(String s, int idx){
		if(s.charAt(idx) >= '3') return false;
		else if(s.charAt(idx) == '2'){
			if(s.charAt(idx + 1) <= '6') return true;
			else return false;
		}
		else if(s.charAt(idx) == '0') return false;
		else return true;
	}
	
	private static boolean ivValidSingleChar(String s, int idx){
		if(s.charAt(idx) == '0') return false;
		else return true;
	}
	
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0) return 0;
        if(s.length() == 1) {
        	if(s.charAt(0) != '0')
        		return 1;
        	else 
        		return 0;
        }
        int[] waysCnt = new int[s.length()];
        for(int i = 0; i < s.length(); ++i){
        	waysCnt[i] = 0;
        }
        
        if(ivValidSingleChar(s, s.length() - 1)) ++waysCnt[s.length() - 1];

        if(ivValidSingleChar(s, s.length() - 2)) waysCnt[s.length() - 2] = waysCnt[s.length() - 1];
        if(ifValidTwoChar(s, s.length() - 2)) ++waysCnt[s.length() - 2];
                
        for(int i = s.length() - 3; i >= 0; --i){
        	if(ivValidSingleChar(s, i)) waysCnt[i] += waysCnt[i + 1];
        	if(ifValidTwoChar(s, i)) waysCnt[i] += waysCnt[i + 2];
        }
        return waysCnt[0];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.numDecodings("012"));
	}

}
