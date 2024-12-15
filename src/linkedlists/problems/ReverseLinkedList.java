package linkedlists.problems;

import linkedlists.LinkedLIst;

public class ReverseLinkedList {
    public LinkedLIst.Node<?> reverseList(LinkedLIst.Node<?> head) {
        LinkedLIst.Node<?> prev = null;
        LinkedLIst.Node<?> curr = head;

        while (curr != null) {
            LinkedLIst.Node<?> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
