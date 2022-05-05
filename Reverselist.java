class Reverselist{
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node temp;
		
		Node(int data){
			this.data=data;
			next=null;
			
		}
	}
		Node reverse(Node node)
		{
			Node prev =null;
			Node current =node;

			Node next =null;
			while(current!=null){
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
				
			}
			
		
		node = prev;
		return node;
		}
	
	void display(Node node){
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
			
		}
	}
	public static void main(String... args){
	 Reverselist list = new  Reverselist();
        list.head=new Node(1);
        list.head.next=new Node(2);
		list.head.next.next=new Node(3);
		
		
		System.out.println("given linkedlist ");
		list.display(head);
		head=list.reverse(head);
			
		System.out.println("given linkedlist is in reverse ");
	     list.display(head);
	
	}
}