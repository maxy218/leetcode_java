import java.util.Arrays;

public class Solution {

    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 != len2) return false;
        if(len1 == 1) return s1.charAt(0) == s2.charAt(0);
        
        char[] cArray1 = s1.toCharArray();
        char[] cArray2 = s2.toCharArray();
        Arrays.sort(cArray1);
        Arrays.sort(cArray2);
        for(int i = 0; i < len1; ++i){
        	if(cArray1[i] != cArray2[i]) return false;
        }
        
        for(int i = 1; i <= len1 - 1; ++i){
        	String s11 = s1.substring(0, i);
        	String s12 = s1.substring(i, len1);
        	String s211 = s2.substring(0, i);
        	String s212 = s2.substring(i, len2);
        	if((isScramble(s11, s211) && isScramble(s12, s212)))
        		return true;
        	else{
            	String s221 = s2.substring(len2 - i, len2);
            	String s222 = s2.substring(0, len2 - i);
            	if(isScramble(s11, s221) && isScramble(s12, s222))
            		return true;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "oyifgtdmeyslstaojpppxvxiavcije";
		String s2 = "oaacejivixvxpppjotslsyemdtgfiy";
		Solution s = new Solution();
		System.out.println(s.isScramble(s1, s2));
	}

}
