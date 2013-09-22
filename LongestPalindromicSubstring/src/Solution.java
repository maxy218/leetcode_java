
public class Solution {
    public String longestPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(s == null || s.length() == 0) return null;
        int curMaxLen = 1;
        int curMaxLeft = 0;
        int curMaxRight = 0;
        int len = s.length();
        for(int center = 0; center <= len - 1; ++center){
        	// 1: if the length of the palindrome is odd
        	int left = center; int right = center;
        	for(; left >= 0 && right <= len - 1; --left, ++right){
        		if(s.charAt(left) == s.charAt(right)){
        			if(right - left + 1 > curMaxLen){
	        			curMaxLen = right - left + 1;
	        			curMaxLeft = left;
	        			curMaxRight = right;
        			}
        		}
        		else{
        			break;
        		}
        	}
        	// 2: if the length of the palindrome is even
        	left = center - 1; right = center;
        	for(; left >= 0 && right <= len - 1; --left, ++right){
        		if(s.charAt(left) == s.charAt(right)){
        			if(right - left + 1 > curMaxLen){
	        			curMaxLen = right - left + 1;
	        			curMaxLeft = left;
	        			curMaxRight = right;
        			}
        		}
        		else{
        			break;
        		}
        	}
        }
        return s.substring(curMaxLeft, curMaxRight + 1);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		String palindrome = null;
		palindrome = s.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth");
		System.out.println(palindrome);
	}

}
