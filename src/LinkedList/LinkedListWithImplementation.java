package LinkedList;

public class LinkedListWithImplementation {
    public LinkedListWithImplementation next;
    int data;

    public LinkedListWithImplementation(int x) {
        this.data = x;
        this.next = null;
    }

    public static void TraverseListIteratively(LinkedListWithImplementation head) {
        LinkedListWithImplementation traverser = head;
        while (traverser != null) {
            System.out.println(traverser.data);
            traverser = traverser.next;
        }
    }

    public static void TraverseListRecursively(LinkedListWithImplementation head) {
        if (head != null) {
            System.out.println(head.data);
            TraverseListRecursively(head.next);
        }
    }

    public static LinkedListWithImplementation InsertAtBegining(LinkedListWithImplementation head, int x) {
        LinkedListWithImplementation newFirstList = new LinkedListWithImplementation(x);
        newFirstList.next = head;
        return newFirstList;
    }

    public static LinkedListWithImplementation InsertAtEnd(LinkedListWithImplementation head, int x) {
        LinkedListWithImplementation temp = new LinkedListWithImplementation(x);
        LinkedListWithImplementation traverser = head;
        if (head == null)
            return temp;
        while (traverser.next != null)
            traverser = traverser.next;
        traverser.next = temp;
        return head;
    }

    public static LinkedListWithImplementation DeleteFirstNode(LinkedListWithImplementation head) {
        if (head == null)
            return head;
        return (head = head.next);
    }

    public static LinkedListWithImplementation DeleteLastNode(LinkedListWithImplementation head) {
        LinkedListWithImplementation traverser = head;
        if (head == null)
            return head;

        if (head.next == null)
            return null;

        while (traverser.next.next != null)
            traverser = traverser.next;

        traverser.next = null;

        return head;
    }


    public static LinkedListWithImplementation InsertAtParticularPos(LinkedListWithImplementation head, int pos, int data) {
        if (head == null || pos == 0) {
            return head;
        }
        LinkedListWithImplementation listTOInsert = new LinkedListWithImplementation(data);
        if (pos == 1) {
            listTOInsert.next = head;
            return listTOInsert;
        }
        LinkedListWithImplementation traverser = head;
        for (int i = 1; i < pos - 1 && traverser != null; i++) {
            traverser = traverser.next;
        }
        if (traverser == null) return head;

        listTOInsert.next = traverser.next;
        traverser.next = listTOInsert;

        return head;
    }

}




