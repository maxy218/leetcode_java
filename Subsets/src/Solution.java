import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
	private class SortByDescend implements Comparator <Object>{
		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			Integer it1 = (Integer)o1;
			Integer it2 = (Integer)o2;
			if(it1 < it2) return 1;
			else return 0;
		}
	}
	
	private void rSubSets(int[] S, int idx, ArrayList<Integer> elem, ArrayList<ArrayList<Integer>> sets){
		if(idx >= S.length){
			ArrayList<Integer> elemDone = new ArrayList<Integer>(elem);
			Collections.sort(elemDone);
			sets.add(elemDone);
			return;
		}
		
		elem.add(S[idx]);
		rSubSets(S, idx+1, elem, sets);
		elem.remove(elem.size() - 1);
		rSubSets(S, idx+1, elem, sets);
	}
	
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(S.length == 0)
    		return null;
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> elem = new ArrayList<Integer>();
    	rSubSets(S, 0, elem, result);
    	return result;
    }
    
    public ArrayList<ArrayList<Integer>> subsets_v2(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(S.length == 0)
    		return null;
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> elem = new ArrayList<Integer>();
    	result.add(elem);
    	Arrays.sort(S);
    	for(int i = 0; i < S.length; ++i){
    		int resultSize = result.size();
    		for(int j = 0; j < resultSize; ++j){
    			elem = new ArrayList<Integer>(result.get(j));
    			elem.add(S[i]);
    			result.add(elem);
    		}
    	}
    	
    	return result;
    }
    
    private void outputSets(ArrayList<ArrayList<Integer>> sets){
    	if(sets == null || sets.size() == 0) return;
    	for(ArrayList<Integer> elem : sets){
    		System.out.print("[");
    		for(Integer it : elem){
    			System.out.print(it + ", ");
    		}
    		System.out.println("]");
    	}
    }
    
    private void outputElem(ArrayList<Integer> elem){
    	if(elem == null || elem.size() == 0) return;
		System.out.print("[");
		for(Integer it : elem){
			System.out.print(it + ", ");
		}
		System.out.println("]");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] S = new int[3];
//		S[0] = 0;
		S[0] =  1; S[1] =  2; S[2] =  3;
		ArrayList<ArrayList<Integer>> sets = s.subsets(S);
		s.outputSets(sets);
//		ArrayList<ArrayList<Integer>> sets_v2 = s.subsets_v2(S);
//		s.outputSets(sets_v2);
	}

}
