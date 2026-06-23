public class Q6_Length_Of_Loop_In_LL {
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

        System.out.println("Loop Length: "+getLoopCount(list));
    }

    static Node<Integer> getMeetingNode(LL<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        if (slow == null || slow.next == null) {
            return null;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
    }

    static int getLoopCount(LL<Integer> list){
        int count=0;
        Node<Integer> meet = getMeetingNode(list);
        
        if(meet==null) return count;
        Node<Integer> current = meet.next;
        count++;

        while (!current.equals(meet)) {
            count++;
            current=current.next;
        }
        return count;
    }
}
