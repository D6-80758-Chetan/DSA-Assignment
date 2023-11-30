public class LinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    LinkedList() {
        head = null;
        tail = null;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(T data) {
        if (isEmpty()) {
            return false;
        }

        if (head.data.equals(data)) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }

        Node<T> current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            if (current.next == null) {
                tail = current;
            }
            return true;
        }

        return false;
    }

    public boolean contains(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    private boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();

        lst.addFirst(10);
        lst.addFirst(20);
        lst.addLast(54);
        lst.display();
    }

}
