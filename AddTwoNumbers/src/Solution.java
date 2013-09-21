
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	int sum = 0;
    	int carry = 0;
    	
    	sum = l1.val + l2.val + carry;
    	carry = sum / 10;
    	ListNode result = new ListNode(sum % 10);
    	l1 = l1.next; l2 = l2.next;
    	ListNode cur = result;
    	while(l1 != null && l2 != null){
    		sum = l1.val + l2.val + carry;
    		cur.next = new ListNode(sum % 10);
    		cur = cur.next;
    		carry = sum /10;
    		l1 = l1.next; l2 = l2.next;
    	}
    	
    	while(l1 != null){
    		sum = l1.val + carry;
    		cur.next = new ListNode(sum % 10);
    		cur = cur.next;
    		carry = sum /10;
    		l1 = l1.next;
    	}
    	while(l2 != null){
    		sum = l2.val + carry;
    		cur.next = new ListNode(sum % 10);
    		cur = cur.next;
    		carry = sum /10;
    		l2 = l2.next;
    	}
    	
    	if(carry != 0){
    		cur.next = new ListNode(carry);
    	}
    	
        return result;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	}

}
