package _6_Linked_Lists;

public class RemoveEveryKthNode {
    Node deleteK(Node head, int k) {
        Node slow = head;
        Node fast = head;

        while (slow != null) {
            for (int i = 1; i <= k; i++) {
                if (fast != null) fast = fast.next;
            }
            slow.next = fast;
            slow = slow.next;
        }

        return head;
    }
}
