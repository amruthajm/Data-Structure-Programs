public class BST {
	public node root;


node insert(node root,int key) {
		if(root==null) {root=new node(key);return root;}
		if(key<root.data) {root.lchild=insert(root.lchild,key);return root;}
		else if(key>root.data) {root.rchild=insert(root.rchild,key);
		return root;}
		return root;
		
	}
	/*	public void insert(int key) {
		
		if(root==null) {
			root=new node(key);
		}
		else {
			root.insert(key);
		}
		
	}*/

	void successor(int k) {
		node r=search(root,k);
		if(r.rchild!=null) {
		System.out.println(	min(r.rchild));
		}
	else {
		
	}
	}
		
	void delete(int key) {
		node r=search(root,key);
		if(r.lchild==null && r.rchild==null) {
			r=null;
		}
		else if() {}
		
	}

void preorder(node t) {
	if(t==null) {return;}
	else {
		System.out.println(t.data);
		preorder(t.lchild);
		preorder(t.rchild);
	}
}

void postorder(node t) {
	if(t==null) {return;}
	else {
		
		postorder(t.lchild);
		postorder(t.rchild);
		System.out.println(t.data);
	}
}

void inorder(node t) {
	if(t==null) {return;}
	else {
		
		inorder(t.lchild);
		System.out.print(t.data);
		inorder(t.rchild);
	}
}
boolean search(node r,int d) {
	if(r==null) {return false;}
	if(r.data==d) {return true;}
	if(d<r.data) {
		return search(r.lchild,d);
	}
	else if(d>r.data){
		return search(r.rchild,d);
	}
	return true;
}
int max(node r) {
	if(r==null) {return -1;}
	else {
		if(r.rchild==null) {return r.data;}
		else {
			return max(r.rchild);
		}
	}
	
}
int min(node r) {
	if(r==null) {return -1;}
	else {
		if(r.lchild==null) {return r.data;}
		else {
			return min(r.lchild);
		}
	}
}
}
