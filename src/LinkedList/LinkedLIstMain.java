package LinkedList;

public class LinkedLIstMain {
    public static void main(String[] args) {

        //TODO Traversing
        /*TraversingList head=new TraversingList(10);
        head.node=new TraversingList(20);
        head.node.node=new TraversingList(40);
        head.node.node.node=new TraversingList(45);
        TraversingList.TraverseListIteratively(head);
        TraversingList.TraverseListRecursively(head);*/

        //TODO adding at Begining
 /*       TraversingList newhead=new TraversingList(10);
        newhead=TraversingList.InsertAtBegining(newhead,31);
        newhead=TraversingList.InsertAtBegining(newhead,34);
        newhead=TraversingList.InsertAtBegining(newhead,51);
        newhead=TraversingList.InsertAtBegining(newhead,100);

        TraversingList.TraverseListRecursively(newhead);*/


        //TODO inset At End
/*        TraversingList head=new TraversingList(10);
        head.node=new TraversingList(20);
        head.node.node=new TraversingList(40);
        head.node.node.node=new TraversingList(45);
        TraversingList.TraverseListIteratively(TraversingList.InsertAtEnd(head,400));
   */

        //TODO delete First NODE
        /*TraversingList head=new TraversingList(10);
        head.node=new TraversingList(20);
        head.node.node=new TraversingList(40);
        head.node.node.node=new TraversingList(45);
        TraversingList.TraverseListIteratively(TraversingList.DeleteFirstNode(head));
*/


        //TODO Delete Last Node
/*        LinkedListWithImplementation head = new LinkedListWithImplementation(10);
        head.node = new LinkedListWithImplementation(20);

        LinkedListWithImplementation.TraverseListIteratively(LinkedListWithImplementation.DeleteLastNode(head));*/

        //TODO Insert at a given Position
        LinkedListWithImplementation head = new LinkedListWithImplementation(10);
        head.next = new LinkedListWithImplementation(20);
        head.next.next = new LinkedListWithImplementation(40);
        head.next.next.next = new LinkedListWithImplementation(45);
        LinkedListWithImplementation.TraverseListIteratively(LinkedListWithImplementation.InsertAtParticularPos(head, 6, 400));


    }
}
