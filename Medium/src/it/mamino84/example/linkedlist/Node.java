package it.mamino84.example.linkedlist;

public class Node {

	private Object value;
	private Node pointer;

	public Node() {
		this.value = null;
		this.pointer = null;
	}

	public Node(Object value) {
		this.value = value;
		this.pointer = null;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Node getPointer() {
		return pointer;
	}

	public void setPointer(Node pointer) {
		this.pointer = pointer;
	}

}




