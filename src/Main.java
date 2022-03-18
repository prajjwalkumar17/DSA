import LinkedList.TraversingList;

public class Main {
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
        TraversingList head = new TraversingList(10);
        head.node = new TraversingList(20);

        TraversingList.TraverseListIteratively(TraversingList.DeleteLastNode(head));


    }
}
