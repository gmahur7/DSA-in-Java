public class Q5_Remove_Cycle_Node_LL {
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
        list.setReference(8, 3);

        Node<Integer> start = getFirstLoopElement(list);
        System.out.println("First Element Of Loop: " + (start == null ? "none" : start.value));
        breakCycleLoop(list);
        list.traverse();
    }

    static Node<Integer> getMeetingNode(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                return slow;
            }
        }
        return null;
    }

    static Node<Integer> getFirstLoopElement(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = getMeetingNode(list);

        while (!slow.equals(fast)) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    static void breakCycleLoop(LL<Integer> list) {
        Node<Integer> element = getFirstLoopElement(list);
        Node<Integer> current = getFirstLoopElement(list);
        while (!current.next.equals(element)) {
            current = current.next;
        }
        current.next = null;
        list.tail=current;
    }

}
