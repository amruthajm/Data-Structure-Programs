public class Driver {
public static void main(String[]args) {
	link o1=new link();
	link o2=new link();
	o1.InsertAtHead(1);
	o1.InsertAtTail(3);
	o2.InsertAtHead(2);
	o2.InsertAtTail(4);
	o2.traversal();
    o1.merge(o2);
	o1.traversal();
	
}
}
