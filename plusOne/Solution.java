public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
	if(digits.length == 0) return null;
	int len = digits.length;
	digits[len - 1] += 1;
        int carry = digits[len - 1]/10;
	digits[len - 1] %= 10;
	for(int i = len - 2; carry > 0 && i >= 0; --i){
		digits[i] += carry;
		carry = digits[i] / 10;
		digits[i] %= 10;
	}
	if(carry > 0){
		int[] newDigits = new int[len + 1];
		newDigits[0] = 1;
		for(int i = 1; i < len + 1; ++i){
			newDigits[i] = digits[i - 1];
		}
		digits = newDigits;
	}
	return digits;
    }
}
