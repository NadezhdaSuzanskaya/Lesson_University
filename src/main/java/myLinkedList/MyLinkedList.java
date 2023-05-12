package myLinkedList;

public class MyLinkedList <T> {
    private Node<T> head;

    public MyLinkedList() {
        this.head = null;
    }
    public T getMyLinkedList(int index) {
        if (head == null) {
            return null;
        }

        Node<T> currentNode = head;
        for (int i = 0; i < index; i++) {
            if (currentNode.next == null) {
                return null;
            }
            currentNode = currentNode.next;
        }

        return currentNode.data;
    }

    public void addMyLinkedList(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next= newNode;
    }

    public void printMyLinkedList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
}
}