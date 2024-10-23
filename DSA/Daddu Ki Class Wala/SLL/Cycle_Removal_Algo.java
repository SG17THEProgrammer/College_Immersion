public class Cycle_Removal_Algo {

    private static class Node {
        private int data;
        private Node next;

    }

    private Node head;
    private Node tail;
    private int size;

    public void InsertAtFirst(int value) {
        // pahale agar linked list khaali hai (head mein null ; next mein null aur data
        // 0 )
        Node newNode = new Node(); // node banayi
        newNode.data = value;
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void InsertAtLast(int value) {
        if (size == 0) {
            InsertAtFirst(value);
        } else {
            Node newNode = new Node(); // node banayi
            newNode.data = value;
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int count() {
        return size;
    }

    public Node GetNode(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Chal htt out of bound hai");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // jabardasti banayi hai need to remove it
    public void CreateCycle() {
        Node newNode = GetNode(2);
        tail.next = newNode;

    }

    public Node hasCycle() {
        Node slowPtr = head;
        Node fastPtr = head;
        // even ka case //odd ka case
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next; // 1 se aage
            fastPtr = fastPtr.next.next; // 2 se aage

            if (slowPtr == fastPtr) {
                return slowPtr;
            }
        }
        return null;
    }

    // O(n^2)
    public void RemoveCycle() {
        Node meetingPoint = hasCycle();
        if (meetingPoint == null) {
            return;// no cycle
        }
        Node start = head;
        while (start != null) {
            Node temp = meetingPoint;
            while (temp.next != meetingPoint) {
                if (temp.next == start) {
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }
            start = start.next;
        }

    }

    public void RemoveCycle1() {
        Node meetingPoint = hasCycle();
        if (meetingPoint == null) {
            return;// no cycle
        }
        // we got cycle length from this
        int count = 1;
        Node temp = meetingPoint;
        while (temp.next != meetingPoint) {
            count++;
            temp = temp.next;
        }
        // ek ko m distance chala do pahale
        Node fast = head;
        for (int i = 1; i <= count; i++) {
            fast = fast.next;
        }

        Node start = head;
        while (start.next != fast.next) {
            start = start.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    public void fylodcycleremoval() {
		Node meetup = hasCycle();
		if (meetup == null) {
			return;
		}
		Node fast = meetup;
		Node start = head;
		while (start.next != fast.next) {
			start = start.next;
			fast = fast.next;
		}
		fast.next = null;

	}


    public static void main(String[] args) {
        Cycle_Removal_Algo obj = new Cycle_Removal_Algo();
        obj.InsertAtLast(1);
        obj.InsertAtLast(2);
        obj.InsertAtLast(3);
        obj.InsertAtLast(4);
        obj.InsertAtLast(5);
        obj.InsertAtLast(6);
        obj.InsertAtLast(7);
        obj.InsertAtLast(8);
        obj.CreateCycle();
        obj.RemoveCycle();
        obj.display();
    }
}
