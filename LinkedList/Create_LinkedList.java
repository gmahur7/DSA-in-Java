class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
        this.value = value;
    }
}

class LL<T> {
    int size = 0;
    Node<T> head;
    Node<T> tail;

    boolean add(T data) {
        Node<T> node = new Node<T>(data);
        if (head == null) {
            head = tail = node;
            size++;
            return true;
        }

        tail.next = node;
        tail = node;
        size++;
        return true;

    }

    boolean setReference(T element, T nextRef) {
        Node<T> current = head;
        Node<T> current2 = head;
        Node<T> nextNode = null;

        if (current == null || current.next == null) {
            return false;
        }

        while (current2 != null) {
            if (current2.value.equals(nextRef)) {
                nextNode = current2;
                break;
            }
            current2 = current2.next;
        }

        if(nextNode==null) return false;

        while (current != null) {
            if (current.value.equals(element)) {
                current.next = nextNode;
                return true;
            }
            current = current.next;
        }

        return true;
    }

    boolean addAfterTarget(T target, T data) {
        Node<T> node = new Node<T>(data);

        Node<T> current = head;

        if (tail.value.equals(target)) {
            tail.next = node;
            tail = node;
            size++;
            return true;
        }

        while (current != null) {
            if (current.value.equals(target)) {
                node.next = current.next;
                current.next = node;
                size++;
                return true;
            }
            current = current.next;
        }

        return false;

    }

    boolean remove(T data) {
        Node<T> current = head;
        Node<T> prev = null;

        while (current != null) {
            if (current.value.equals(data)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }

                if (current == tail) {
                    tail = prev;
                }

                size--;
                return true;
            }

            prev = current;
            current = current.next;
        }

        return false;

    }

    Node<T> removeHead() {
        Node<T> current = head;
        if (current == null) {
            return null;
        }

        head = current.next;
        return current;
    }

    Node<T> removeTail() {
        Node<T> current = head;
        if (current == null) {
            return null;
        }

        Node<T> prev = null;

        while (current != null) {
            if (current.next == null) {
                prev.next = null;
                tail = prev.next;
                return current;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    boolean insertHead(T data) {
        Node<T> node = new Node<T>(data);
        if (head == null) {
            head = tail = node;
            size++;
            return true;
        }

        node.next = head;
        head = node;
        size++;
        return true;

    }

    boolean contains(T data) {
        Node<T> current = head;
        if (head == null) {
            return false;
        }
        while (current != null) {
            if (current.value.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    int getSize() {
        return this.size;
    }

    T getHead() {
        return head.value;
    }

    T getTail() {
        return tail.value;
    }

    void reverse() {
        Node<T> current = head;
        Node<T> originalHead = head;

        if (current == null) {
            return;
        }

        if (size == 1) {
            return;
        }

        Node<T> prev = null;

        while (current != null) {
            Node<T> temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        head = prev;
        tail = originalHead;
    }

    void recursiveReverse(Node<T> node) {
        if (node == null || node.next == null) {
            return;
        }

    }

    void traverse() {
        Node<T> current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println();
        return;
    }
}

public class Create_LinkedList {
    public static void main(String[] args) {
        LL<Integer> list = new LL<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.traverse();

        // list.remove(2);
        // list.traverse();

        // list.insertHead(0);
        // list.traverse();

        // list.addAfterTarget(1, 2);
        // list.traverse();

        // System.out.println(list.contains(2));
        // System.out.println(list.contains(5));

        // list.reverse();

        // System.out.println("Head: " + list.getHead());
        // System.out.println("Tail: " + list.getTail());
        // list.traverse();

        list.removeHead();
        list.traverse();

        list.removeTail();
        list.traverse();
    }
}
