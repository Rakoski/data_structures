package structures.linkedlists.problems;

import structures.linkedlists.LinkedLIst;

public class ReverseLinkedList {
    public LinkedLIst.Node<?> reverseList(LinkedLIst.Node<?> head) {
        LinkedLIst.Node<?> prev = null;
        LinkedLIst.Node<?> curr = head;

        while (curr != null) {
            LinkedLIst.Node<?> temp = curr.next; // temporary node to not meddle with curr and prev
            curr.next = prev; // mudei o ponteiro next pra nulo (ou seja, pra antes)
            prev = curr; // mudei o ponteiro prev pra ser o de agora (ou seja, pra linha de cima funcionar
            // pro próximo node na lista)
            curr = temp; // pra continuar o loop
        }
        return prev;
    }
}
