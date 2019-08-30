package it.mamino84.example.linkedlist;

import java.io.Serializable;
import java.util.Iterator;

public class Node implements Serializable, Iterable {

	private static final long serialVersionUID = 3359353877043065739L;
	private Object value;
	private Node pointer;

	public Node() {
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
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
