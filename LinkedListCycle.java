package leetcode;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastptr = head;
		while (slowPtr != null && fastptr != null && fastptr.next != null) {
			slowPtr = slowPtr.next;
			fastptr = fastptr.next.next;

			if (slowPtr == fastptr) {
				return true;
			}
		}

		return false;

	}
}

 class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
		next = null;
	}
}
