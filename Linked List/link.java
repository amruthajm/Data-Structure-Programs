
	public class link{
	public Node head=null;

	public void InsertAtHead(int x) {
		Node newnode=new Node(x);
		newnode.next=head;
		head= newnode;
	}

	public void traversal() {
		if(head==null) {
			System.out.println("list is empty");
			}
		Node temp = head; 
		while(temp!=null) {
		   System.out.println(temp.data+" ");
			temp=temp.next;
			
		}
	}
	public void InsertAtTail(int y) {
		Node newnode=new Node(y);
		
		if(head==null) {
			head=newnode;
		}
		Node temp = head; 
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	public void InsertAtK(int k,int y) {
		Node newnode=new Node(y);
		int i=1;
		Node temp = head; 
		while(i<k) {
			temp=temp.next;
			i++;
		}
		newnode.next=temp.next;
		temp.next=newnode;
	}

	public int search(int x) {
		Node temp = head; 
		int pos=0;
		while(temp!=null) {
			if(temp.data==x) {
				return pos;
			}
			temp=temp.next;
			pos++;
		}
		return -1;
	}
	public int count_nodes() {
		Node temp=head;
		int count=0;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	public void even_data() {
		Node temp=head;
		while(temp!=null) {
			if(temp.data%2==0) {
				System.out.println(temp.data);
			}
			temp=temp.next;
		}
	}
	public void mid_element(){
		Node temp = head; 
		int x=count_nodes();
		if((x%2)==0) {
			int mid=x/2,i=1;
			while(i<=mid) {
				if(i==mid) {
					System.out.println(temp.data);
				}
				temp=temp.next;
				i++;
			}
			System.out.println(temp.data);
		}
		else {
			int mid=(x+1)/2,j=1;
			while(j<mid) {
				temp=temp.next;
				j++;
			}
			System.out.println(temp.data);
		}

	}
	public void node_in_sorted_list(int x) {
		Node newnode = new Node(x);
		Node temp = head;
		Node prev=head;
		while(temp!=null) {
			if(x<temp.data)
			{
				newnode.next=temp;
			
			    prev.next=newnode;
			break;}
			else {
				prev=temp;
				temp=temp.next;
			}
		}
	}
	
	public void merge(link o2) {
	    
		Node temp1=this.head;
		Node temp2=o2.head;
		while(temp1!=null && temp2!=null) {
			if(temp1.data<temp2.data) {
				if(temp1.data==this.head.data) {this .InsertAtHead(temp1.data);}
				else{this .InsertAtTail(temp1.data);
				temp1=temp1.next;}
			}
			else {
				if(temp2.data==o2.head.data) {this .InsertAtHead(temp2.data);}
				else{this .InsertAtTail(temp2.data);
				temp2=temp2.next;}
			}
		}
		while(temp1!=null) {
			this.InsertAtTail(temp1.data);
			temp1=temp1.next;
		}
		while(temp2!=null) {
			this.InsertAtTail(temp2.data);
			temp2=temp2.next;
		}
		
	}

	}
