
public class driver {
	public static void main(String[]args) {
BST o=new BST();
 
node root=new node();
o.insert(root,19);
o.insert(root,199);
o.insert(root,45);
o.insert(root,60);
o.preorder(root);
o.postorder(root);
o.inorder(root);
System.out.println(o.min(root));
System.out.println(o.max(root));
	}
}
