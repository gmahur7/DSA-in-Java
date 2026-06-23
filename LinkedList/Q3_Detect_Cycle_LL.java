public class Q3_Detect_Cycle_LL {
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

        System.out.println("Loop: " + findLoop(list));
    }

    static boolean findLoop(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                return true;
            }
        }

        return false;
    }
}
