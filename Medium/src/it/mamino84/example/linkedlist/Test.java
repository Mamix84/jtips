package it.mamino84.example.linkedlist;

public class Test {

	public static void main(String[] args) {

		addingFirst();

		addingLast();

		removingFirst();

		removingLast();

		iterator();
	}

	private static void addingFirst() {
		LinkedList list = new LinkedList();

		list.addFirst("A");

		list.addFirst("B");

		list.addFirst("C");

		System.out.println(list.getSize());
	}

	private static void addingLast() {
		LinkedList list = new LinkedList();

		list.addLast("A");

		list.addLast("B");

		list.addLast("C");

		System.out.println(list.getSize());
	}

	private static void removingFirst() {
		LinkedList list = new LinkedList();

		list.addLast("A");

		list.addLast("B");

		list.addLast("C");

		try {
			list.removeFirst();
		} catch (NoMoreElementToRemoveException e) {
			e.printStackTrace();
		}

		System.out.println(list.getSize());
	}

	private static void removingLast() {
		LinkedList list = new LinkedList();

		list.addLast("A");

		list.addLast("B");

		list.addLast("C");

		try {
			list.removeLast();
		} catch (NoMoreElementToRemoveException e) {
			e.printStackTrace();
		}

		System.out.println(list.getSize());
	}

	private static void iterator() {
		LinkedList list = new LinkedList();

		list.addLast("A");

		list.addLast("B");

		list.addLast("C");

		for (Object value : list) {
			System.out.println(value.toString());
		}
	}

}
