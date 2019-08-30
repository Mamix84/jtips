package it.mamino84.example.linkedlist;

public class LinkedList {

	private Node first;
	private Node last;
	
	public LinkedList() {
		first = new Node();
		last = first;
	}

	public Node getFirst() {
		return first;
	}

	public void setFirst(Node first) {
		this.first = first;
	}

	public Node getLast() {
		return last;
	}

	public void setLast(Node last) {
		this.last = last;
	}
	
	
	
	
}
