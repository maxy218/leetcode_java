
public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(x < 0) return false;
        if(x < 10) return true;
        int sigBit = 1;
        while(x /sigBit >= 10){
        	sigBit *= 10;
        }
        while(sigBit > 0){
        	if(x%10 != (x/sigBit)%10) return false;
        	sigBit /= 100;
        	x /= 10;
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		System.out.println(s.isPalindrome(0));
		System.out.println(s.isPalindrome(1));
		System.out.println(s.isPalindrome(6));
		System.out.println(s.isPalindrome(10));
		System.out.println(s.isPalindrome(11));
		System.out.println(s.isPalindrome(16));
		System.out.println(s.isPalindrome(99));
		System.out.println(s.isPalindrome(100));
		System.out.println(s.isPalindrome(1128668211));
		
	}

}
