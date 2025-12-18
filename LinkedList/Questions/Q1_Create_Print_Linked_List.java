class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

class Linked {
    Node<Integer> head;

    public void add(int value) {
        Node<Integer> newNode = new Node<>(value);

        // If list is empty, make new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        Node<Integer> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList() {
        Node<Integer> current = head;

        if (current == null) {
            System.out.println("List is empty");
        }

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

}

class Q1_Create_Print_Linked_List {

    public static void main(String[] args) {
        Linked list = new Linked();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.printList();
    }
}