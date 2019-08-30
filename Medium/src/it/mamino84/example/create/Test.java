package it.mamino84.example.create;

import it.mamino84.example.model.Book;

@SuppressWarnings("unused")
public class Test {

	public void main() {
		
		//Use default constructor
		Book defaultBook = new Book();
		
		//Use constructor with attributes
		Book bookWithAttributes = new Book("Inferno", "Dante", 430);

	}	
	
	
	private Book defaultBook;
	private Book bookWithAttributes;
	
	public void defaultExecution() {
		defaultBook = new Book();
	}
	
	public void withAttributesExecution() {
		bookWithAttributes = new Book("Inferno", "Dante", 430);
	}

}
