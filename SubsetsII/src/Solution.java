import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;


public class Solution {	
	private void rSubSets(int[] S, int idx, ArrayList<Integer> elem, ArrayList<ArrayList<Integer>> sets, Set<String> existElem){
		if(idx >= S.length){
			ArrayList<Integer> elemDone = new ArrayList<Integer>(elem);
			Collections.sort(elemDone);
			if(!existElem.contains(elemDone.toString())){
				existElem.add(elemDone.toString());
				sets.add(elemDone);
			}
//			System.out.println(elemDone.toString());
			return;
		}
		
		elem.add(S[idx]);
		rSubSets(S, idx+1, elem, sets, existElem);
		elem.remove(elem.size() - 1);
		rSubSets(S, idx+1, elem, sets, existElem);
	}
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(num.length == 0)
    		return null;
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Integer> elem = new ArrayList<Integer>();
    	Set<String> existElem = new HashSet<String>();
    	rSubSets(num, 0, elem, result, existElem);
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
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] S = new int[3];
		S[0] =  1; S[1] =  2; S[2] =  2;
		ArrayList<ArrayList<Integer>> sets = s.subsetsWithDup(S);
		s.outputSets(sets);
	}

}
