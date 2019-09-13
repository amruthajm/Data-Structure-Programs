
public class node {
int data;
node left;
node right;
int balanceFactor;
node(int d){
	data=d;
	balanceFactor=0;
	left=null;
	right=null;
}

public void traversal(){
if(left!=null){
left.traversal();}
System.out.println(data+"");
if(right!=null){
right.traversal();}

}
public int height() {
	
	if(this.left==null && this.right==null ) {
		return 1;
	}
	else if(this.right==null) {
		return left.height()+1;
	}
	else if(this.left==null) {
		return (right.height())+1;
		
	}
	else{
		return Math.max(this.left.height(),this.right.height())+1;
	}
}
public int computeBalance() {
	if(this.left==null && this.right==null) {return 0;}
	if(this.right==null) {return left.height();}
	else if(this.left==null) {return -1*(right.height());}
	else {
		return left.height()-right.height();
	}
}
public node rotationWithLeftChild() {
	node lc=left;
	left=lc.right;
	lc.right=this;
	computeBalance();
	lc.computeBalance();
	return lc;
}
public node rotationWithRightChild() {
	node lc=right;
	right=lc.left;
	lc.left=this;
	computeBalance();
	lc.computeBalance();
	return lc;
}
public node insert(int key) {
if(key<data) {
	if(left==null) {
		left=new node(key);
	}	
	else {
		left=left.insert(key);
	}
}
else {
	if(right==null) {
		right=new node(key);
	}
	else {
		right=right.insert(key);
	}
}

balanceFactor= computeBalance();
switch(balanceFactor) {
case 2:if(left.balanceFactor>=0) {return rotationWithLeftChild();}
       else {left=left.rotationWithRightChild();}
            break;
case -2: if(right.balanceFactor<=0) {
	        return rotationWithRightChild();
            }  
         else {
	           right=right.rotationWithRightChild();
	           return rotationWithRightChild();
         }  
            
}
return this;
}
public boolean search(int key) {
	if(key==data) {return true;}
	else if(key<data && left!=null) {return left.search(key);}
	else if(key>data && right!=null) {
		return right.search(key);
	}
	else {
		return false;
	}
}
}

