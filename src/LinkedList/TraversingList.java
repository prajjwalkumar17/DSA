package LinkedList;

public class TraversingList {
    public TraversingList node;
    int x;

    public TraversingList(int x) {
        this.x = x;
        this.node = null;
    }

    public static void TraverseListIteratively(TraversingList head) {
        TraversingList traverser = head;
        while (traverser != null) {
            System.out.println(traverser.x);
            traverser = traverser.node;
        }
    }

    public static void TraverseListRecursively(TraversingList head) {
        if (head != null) {
            System.out.println(head.x);
            TraverseListRecursively(head.node);
        }
    }

    public static TraversingList InsertAtBegining(TraversingList head, int x) {
        TraversingList newFirstList = new TraversingList(x);
        newFirstList.node = head;
        return newFirstList;
    }


    public static TraversingList InsertAtEnd(TraversingList head, int x) {
        TraversingList temp = new TraversingList(x);
        TraversingList traverser = head;
        if (head == null)
            return temp;
        while (traverser.node != null)
            traverser = traverser.node;
        traverser.node = temp;
        return head;
    }

    public static TraversingList DeleteFirstNode(TraversingList head) {
        if (head == null)
            return head;
        return (head = head.node);
    }

    public static TraversingList DeleteLastNode(TraversingList head) {
        TraversingList traverser = head;
        if (head == null)
            return head;

        if (head.node == null)
            return null;

        while (traverser.node.node != null)
            traverser = traverser.node;

        traverser.node = null;

        return head;
    }

}




