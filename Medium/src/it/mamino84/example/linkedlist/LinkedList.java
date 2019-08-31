package it.mamino84.example.linkedlist;

public class LinkedList {

	private Node first;
	private Node last;

	// CONSTRUCTOR
	public LinkedList() {
		first = null;
		last = null;
	}

	// GETTER-SETTER
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

	// BUSINESS LOGIC
	public void addFirst(Object value) {
		Node node = new Node();
		node.setValue(value);

		if (getSize() == 0) {
			this.first = node;
			this.last = node;
		} else {
			Node temp = this.first;
			first = node;
			node.setPointer(temp);
		}
	}

	public void addLast(Object value) {
		Node node = new Node();
		node.setValue(value);

		if (getSize() == 0) {
			this.last = node;
			this.first = node;
		} else {
			this.last.setPointer(node);
			this.last = node;
		}
	}

	public void removeFirst() {
		first = first.getPointer();
	}

	public void removeLast() {
		Node node = first;
		while (node != null) {
			if (node.getPointer() == null && node == first) {
				first = null;
				last = null;
				break;
			} else if (node.getPointer().getPointer() == null) {
				node.setPointer(null);
				last = node;
				break;
			}
			node = node.getPointer();
		}
	}

	public int getSize() {
		int size = 0;
		Node node = first;
		while (node != null) {
			node = node.getPointer();
			size++;
		}
		return size;
	}

}
