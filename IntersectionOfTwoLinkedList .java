class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }

  
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

  
        ListNode common = new ListNode(3);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = common;

        ListNode headB = new ListNode(6);
        headB.next = common;

        Solution sol = new Solution();
        ListNode result = sol.getIntersectionNode(headA, headB);

        System.out.println("List A:");
        printList(headA);

        System.out.println("List B:");
        printList(headB);

        System.out.println("Intersection Node Value: " +
                (result != null ? result.val : "No Intersection"));
    }
}
