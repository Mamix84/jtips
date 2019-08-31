package it.mamino84.example.linkedlist;

import java.util.Iterator;

public class ListIterator implements Iterator<Object> {

	private Node cursor;

	public ListIterator(LinkedList list) {
		this.cursor = list.getFirst();
	}

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

}