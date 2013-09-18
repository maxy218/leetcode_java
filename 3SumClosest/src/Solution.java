import java.util.Arrays;

public class Solution {

    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int sum = 0;
        int len = num.length;
        Arrays.sort(num);
        int minDiff = 0x7fffffff;
        int closestSum = 0;
        for(int i = 0; i < len - 2; ++i){
        	int l = i + 1;
        	int r = len - 1;
        	while(l < r){
        		sum = num[i] + num[l] + num[r];
        		if(sum == target) return target;
        		int diff = Math.abs(sum - target);
        		if(diff < minDiff){
        			closestSum = sum;
        			minDiff = diff;
        		}

        		if(sum < target) ++l;
        		else --r;
        	}
        }
        return closestSum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {-1, 2, 1, -4};
//		int target = 1;
		int[] array = {1, 1, 1, 0};
		int target = -100;
		Solution s = new Solution();
		System.out.println(s.threeSumClosest(array, target));
	}

}
