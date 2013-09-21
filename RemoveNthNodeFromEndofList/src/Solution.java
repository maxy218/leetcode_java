class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(head == null) return null;
    	ListNode newHead = new ListNode(-1);
    	newHead.next = head;
    	int cnt = 0;
    	ListNode prev = newHead;
    	ListNode latter = newHead;
    	while(cnt++ < n)
    		prev = prev.next;
    	
    	while(prev.next != null){
    		prev = prev.next;
    		latter = latter.next;
    	}
    	latter.next = latter.next.next;
        return newHead.next;
    }
    
    private void outputList(ListNode head){
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
		Solution s = new Solution();
		s.outputList(head);
		head = s.removeNthFromEnd(head, 5);
		s.outputList(head);
	}

}
