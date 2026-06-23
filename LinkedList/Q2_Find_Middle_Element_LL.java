public class Q2_Find_Middle_Element_LL {
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

        System.out.println("Middle: " + findMiddle(list));
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
