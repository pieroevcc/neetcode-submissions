

class LinkedList {
    private class Node {
        int val;
        Node next;
        Node(int val) { this.val = val; }
    }

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        
        Node curr = head; // Use a temp pointer, not the actual head
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if (size == 0) tail = newNode; // First element is both head and tail
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index < 0 || index >= size) return false;

        if (index == 0) {
            head = head.next;
            if (size == 1) tail = null;
        } else {
            Node curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if (index == size - 1) tail = curr; // Update tail if last element removed
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            result.add(curr.val);
            curr = curr.next;
        }
        return result;
    }
}