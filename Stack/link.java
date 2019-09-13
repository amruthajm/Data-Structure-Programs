public class link {
public	node top= new node();
public void push(int x) {
	node newnode = new node(x);

	if(top==null) {
		top=newnode;
	}
	else {
		newnode.next=top;
		top=newnode;
	}
}
public void pop() {
	node temp=top;
	if(top.data==0 || top ==null) {System.out.println("Stack is empty");}
	top=top.next;
	temp.next=null;
	System.out.println("popped element is "+temp.data);
}
public void push_s(char s) {
	node newnode = new node(s);

	if(top==null) {
		top=newnode;
	}
	else {
		newnode.next=top;
		top=newnode;
	}
}

public char pop_s() {
	node temp=top;
	if(top.s==0 || top ==null) {System.out.println("Stack is empty");}
	top=top.next;
	temp.next=null;
	System.out.print(temp.s);
	return temp.s;
}

public int check_palindrome(String s) {
	int l= s.length();
	for(int i=0,j=l-1;i<l/2;i++,j--) {
		if(s.charAt(i)!=s.charAt(j)) {return -1;}
	}
	return 1;
}

public void check_palindrome2(String s) {
		node temp = top;
		String r="";
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
	
		if(s.compareTo(r)==0) {
			System.out.println("palindrome");
		}
		else {System.out.println("not a palindrome");}
		
	}
}


