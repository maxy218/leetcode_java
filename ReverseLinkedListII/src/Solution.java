class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(head == null || head.next == null)
    		return head;
    	if(m > n) return null;
    	else if(m == n) return head;
    	
    	ListNode newHead = new ListNode(0);
    	newHead.next = head;
    	ListNode l = newHead;
    	ListNode r = head;
    	int cnt = 1;
    	while(cnt < n + 1){
    		if(cnt < m){
    			l = l.next;
    		}
			r = r.next;
			++cnt;
    	}
    	// l and r are not reversed. They are out of the reversed region. r could be null in some cases.
    	
    	ListNode pre = l.next;
    	ListNode cur = l.next.next;
    	ListNode next = l.next.next.next;
    	pre.next = r;
    	while(next != r){
    		cur.next = pre;
    		pre = cur;
    		cur = next;
    		next = next.next;
    	}
    	cur.next = pre;
    	l.next = cur;
    	
    	return newHead.next;
    }
    
    static public void output(ListNode head){
    	while(head != null){
    		System.out.print(head.val + ", ");
    		head = head.next;
    	}
    	System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		output(head);
		Solution s = new Solution();
		ListNode newHead = s.reverseBetween(head, 2, 5);
		output(newHead);
	}

}
