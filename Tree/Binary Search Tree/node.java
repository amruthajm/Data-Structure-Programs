public class node {
int data ;
node lchild;
node rchild;
node(int d){
	data=d;
lchild=null;
rchild=null;

}
public void insert(int key) {
	
	if(key<data) {
		if(lchild==null) {lchild=new node(key);}
		else {
			lchild.insert(key);
		}
	}
	else {
		if(rchild==null) {
			rchild=new node(key);
		}
		else {
			rchild.insert(key);
		}
	}
}
}
