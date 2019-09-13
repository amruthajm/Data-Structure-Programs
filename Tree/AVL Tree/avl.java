
public class avl {

	
		public node root;
		public void insert(int key){
			if (root==null) {root=new node(key);}
			else {
				root.insert(key);
			}
		}
		
		public void traversal() {
			
			if(root==null) {return ;}
			else {
				root.traversal();
			}
			System.out.println();
		}
	
}

