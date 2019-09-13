
public class driver {
	public static void main(String[]args) {
		avl o=new avl();
		
		o.insert(20);
		o.insert(25);
		o.insert(10);
		o.insert(5);
		o.insert(3);
	    o.traversal();
		o.root.search(25);
	}
}

