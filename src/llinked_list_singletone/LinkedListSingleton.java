package llinked_list_singletone;;

public class LinkedListSingleton {
	
	Node head;
	
	class Node{
		
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
		}
		
	}
	
	public void addFirst(String data) {
		
		Node newNode=new Node(data);
		
		if(head == null) {
			head =newNode;
			return;
		}
		
		newNode.next=head;
		head=newNode;
		
	}
	
	public void addLast(String data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head=newNode;
			return; 
		}
		
		Node currentNode=head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next=newNode;
	}
	
	public void removeFirst() {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		head = head.next;
	}
	
	public void removeLast() {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node lastNode = head.next;
		Node lastSecond = head;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			lastSecond = lastSecond.next;
		}
		
		lastSecond.next = null;
		
	}
	
	public int size() {
		int size = 0;
		
		Node currentNode = head;
		while(currentNode != null) {
			size++;
			currentNode = currentNode.next;
		}
		
		return size;
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.println("LinkedList is Empty");
			return;
		}
		
		Node currentNode=head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
		
		System.out.println();
	}
	
	
	public static void main(String[] args) {

		LinkedListSingleton list=new LinkedListSingleton();
		
		//Add Value to 1st position
		list.addFirst("1");
		list.addFirst("2");
		list.addFirst("3");
		list.addFirst("4");
		
		//Add Value to the Last position
		list.addLast("2");
		
		//To know the size of list...
		System.out.println("Size : " + list.size());
		
		// Print
				list.printList();
		
		//remove 1st Value
		list.removeFirst();
		list.printList();
		
		//remove Last Value
		list.removeLast();
		list.printList();
		
	}

}
