package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode list = new ListNode(5);
		ListNode list1 = new ListNode(1);
		ListNode list2 = new ListNode(5);
		list1.next = list;
		list2.next = list1;
		System.out.println(list.val);
		System.out.println(list1.val);
		System.out.println(list2.val);
		ListNode list3 = new ListNode(9);
		System.out.println(list3.val);

		ListNode q = addTwoNumbers(list2, list3);
		ListNode t = new ListNode(0);
		t.next = q;
		while (t.next != null) {
			t = t.next;
			System.out.println(t.val);

		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
