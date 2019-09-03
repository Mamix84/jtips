package it.mamino84.example.linkedlist;

import java.util.Iterator;

public class LinkedList implements Iterable<Object> {

	private Node first;
	private Node last;

	// CONSTRUCTOR
	public LinkedList() {
		first = null;
		last = null;
	}

	// GETTER/SETTER
	public Node getFirst() {
		return first;
	}

	public Node getLast() {
		return last;
	}

	// BUSINESS METHOD
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

	public void removeFirst() throws NoMoreElementToRemoveException {
		if (getSize() == 0)
			throw new NoMoreElementToRemoveException();

		first = first.getPointer();
	}

	public void removeLast() throws NoMoreElementToRemoveException {
		if (getSize() == 0)
			throw new NoMoreElementToRemoveException();

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

	@Override
	public Iterator<Object> iterator() {
		Iterator<Object> it = new Iterator<Object>() {

			private Node cursor = getFirst();

			@Override
			public boolean hasNext() {
				return cursor != null;
			}

			@Override
			public Object next() {
				if (cursor == null)
					return null;

				Object value = cursor.getValue();
				cursor = cursor.getPointer();
				return value;
			}

		};
		return it;
	}

}
