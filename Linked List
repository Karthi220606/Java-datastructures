package practice;

class Oode{
	int data;
	Oode next;
	Oode head;
	Oode(int data){
		this.data=data;
		this.next=null;
	}
}
class Insertion{
	Oode head;
	void insertAtbeg(int n) {
		Oode node=new Oode(n);
	
	if(head==null) {
		head=node;
	}
	else {
		node.next=head;
		head=node;
	}
	}
	void insertatend(int n) {
		Oode node=new Oode(n);
		if(head==null)
			head=node;
		else {
		Oode temp=head;
		while(temp.next!=null)
			 temp=temp.next;
		temp.next=node;
		}
	}
	
	void delete(int n) {
		Oode temp=head;
		if(temp.data==n) {
			head=temp.next;
			return;
		}
		
		while(temp.next!=null && temp.next.data !=n  ) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	void deleteAtIndex(int n) {
		Oode temp=head;
		if(n==1) {
			head=temp.next;
			return;
	    }
		else {
			for(int i=1;i<n-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		
	}
	
	void reverse() {
	    Oode prev = null;
	    Oode current = head;

	    while (current != null) {
	        Oode nextNode = current.next;
	        current.next = prev;
	        prev = current;
	        current = nextNode;
	    }

	    head = prev;
	}
	
	void print() {
		Oode temp=head;
		System.out.println("Elements are :");
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	void middle() {
		Oode slow=head;
		Oode fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("Middle element :"+slow.data);
	}
	void cycle() {
		int flag=0;
		Oode slow=head,fast=head;
		while(fast!=head && fast!=null && slow!=null) {
			if(fast==slow) {
				System.out.println("Cycle Detected");
				flag=1;
				break;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		if(flag==0)
			System.out.println("No cycle in Linked List");
	}
	
	Oode merge(Oode head1, Oode head2) {
	    Oode dummy = new Oode(0);
	    Oode tail = dummy;

	    while (head1 != null && head2 != null) {
	        if (head1.data <= head2.data) {
	            tail.next = new Oode(head1.data);
	            head1 = head1.next;
	        } else {
	            tail.next = new Oode(head2.data);
	            head2 = head2.next;
	        }
	        tail = tail.next;
	    }

	    while (head1 != null) {
	        tail.next = new Oode(head1.data);
	        tail = tail.next;
	        head1 = head1.next;
	    }

	    while (head2 != null) {
	        tail.next = new Oode(head2.data);
	        tail = tail.next;
	        head2 = head2.next;
	    }

	    return dummy.next;
	}
}





public class LinkedList {

	public static void main(String[] args) {
		Insertion n=new Insertion();
		n.insertAtbeg(2);
		n.insertatend(4);
		n.insertatend(6);
		n.insertatend(10);
		n.insertatend(11);
		n.insertatend(12);
		n.delete(5);
		n.deleteAtIndex(5);
		n.reverse();
		n.middle();
		n.cycle();
		n.print();
		Insertion n1=new Insertion();
		n1.insertAtbeg(1);
		n1.insertatend(3);
		n1.insertatend(5);
		n1.insertatend(6);
		n1.insertatend(7);
		n1.insertatend(8);
        Insertion n2=new Insertion();
        n2.head=n2.merge(n.head, n1.head);
        n2.print();
	}

}
