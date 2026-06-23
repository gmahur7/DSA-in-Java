public class Q1_Reverse_LL {
    public static void main(String[] args) {
        LL<Integer> list = new LL<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        // list.setReference(8,3);

        // list.traverse();
        // reverse(list);
        // list.traverse();
        System.out.println("Loop: " + findMiddle(list));
    }

    static void reverse(LL<Integer> list) {
        Node<Integer> current = list.head;
        Node<Integer> orgHead = list.head;
        Node<Integer> prev = null;

        if (current == null || current.next == null) {
            return;
        }

        while (current != null) {
            Node<Integer> temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        list.head = prev;
        list.tail = orgHead;
    }

    static boolean findLoop(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    static int findMiddle(LL<Integer> list) {

        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        if (slow == null) {
            return -1;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow.value;
    }

}
