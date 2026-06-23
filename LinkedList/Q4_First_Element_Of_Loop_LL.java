import java.util.HashMap;
import java.util.Map;

public class Q4_First_Element_Of_Loop_LL {
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

        System.out.println("First Element Of Loop: " + getFirstElementOfLoop2(list));
    }

    static int getFirstElementOfLoop(LL<Integer> list) {
        Node<Integer> current = list.head;

        Map<Node<Integer>, Integer> map = new HashMap<>();

        while (current != null) {
            if (map.containsKey(current)) {
                return current.value;
            }
            map.put(current, 0);
            current = current.next;
        }
        return -1;
    }

    static int getFirstElementOfLoop2(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                break;
            }
        }

        if (fast == null)
            return -1;

        slow = list.head;

        while (slow != null) {
            if (slow.equals(fast)) {
                return slow.value;
            }
            slow = slow.next;
            fast = fast.next;
        }

        return -1;
    }
}
