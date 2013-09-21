import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(s == null || s.length() == 0) return 0;
    	
    	int len = s.length();
    	int[] curMaxNoRepLen = new int[len];
    	final int charNum = 256;
    	int[] charLastPos = new int[charNum];
    	for(int i = 0; i < charNum; ++i){
    		charLastPos[i] = -1;
    	}
    	
    	curMaxNoRepLen[0] = 1;
    	charLastPos[s.charAt(0)] = 0;
    	int maxNoRepLen = 1;
    	for(int i = 1; i < len; ++i){
    		curMaxNoRepLen[i] = curMaxNoRepLen[i - 1] + 1;
    		if(charLastPos[s.charAt(i)] != -1){
    			int len1 = i - charLastPos[s.charAt(i)];
    			curMaxNoRepLen[i] = len1 < curMaxNoRepLen[i] ? len1 : curMaxNoRepLen[i];
    		}
    		charLastPos[s.charAt(i)] = i;
    		if(curMaxNoRepLen[i] > maxNoRepLen){
    			maxNoRepLen = curMaxNoRepLen[i];
    		}
    	}
        return maxNoRepLen;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
	}

}
