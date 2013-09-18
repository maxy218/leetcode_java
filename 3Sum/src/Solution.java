import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

public class Solution {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int len = num.length;
    	Map<Integer, Integer> hashNumExist = new HashMap<Integer, Integer>();
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
    	Set<ArrayList<Integer>> resultSet = new HashSet<ArrayList<Integer>>();
    	
    	for(Integer i = 0; i < len; ++i)
    		hashNumExist.put(num[i], i);
    	for(Integer i = 0; i < len - 1; ++i){
    		for(Integer j = i + 1; j < len; ++j){
    			if(hashNumExist.containsKey(-num[i] - num[j])){
    				Integer idx = hashNumExist.get((-num[i] - num[j]));
    				if(idx > j){
	    				ArrayList<Integer> tmp = new ArrayList<Integer>();
	    				tmp.add(num[i]);
	    				tmp.add(num[j]);
	    				tmp.add(-num[i] - num[j]);
	    				Collections.sort(tmp);
	    				if(!resultSet.contains(tmp))
	    					resultSet.add(tmp);
    				}
    			}
    		}
    	}

    	for(ArrayList<Integer> tmp : resultSet)
    		result.add(tmp);
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {-1, 0, 1, 2, -1, -4};
		Solution s = new Solution();
		ArrayList<ArrayList<Integer>> result = s.threeSum(array);
		for(ArrayList<Integer> tmp : result){
			for(Integer i : tmp){
				System.out.print(i.toString() + ", ");
			}
			System.out.println("");
		}
	}

}
