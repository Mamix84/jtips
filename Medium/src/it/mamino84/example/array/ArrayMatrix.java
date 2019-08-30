package it.mamino84.example.array;

import it.mamino84.example.model.Book;

@SuppressWarnings("unused")

public class ArrayMatrix {

	public static void main(String[] args) {

		// DECLARATION
		int values[][];
		String [][] crossword;
		Book library[][];


		//INIITIALIZATION
		values = new int[10][10];
		
		String[][] crosswords ={
				{"A","P","P","L","E"},
				{"J","U","I","C","E"}
				};

		library = new Book[4][4];
		for (int i = 0; i < library.length; i++) {
			for (int j = 0; j < library[i].length; j++) {
				library[i][j] = new Book();
			}
		}

	
		// DIRECT ACCESS
		String character = crosswords[0][3];
		System.out.println("Character: "+character);
		
		
		// FOR
		for (int i = 0; i < library.length; i++) {
			for (int j = 0; j < library[i].length; j++) {
				System.out.println(library[i][j]);
			}
		}
		
		// WHILE
		int i=0;
		int j=0;
		while(i<library.length) {
			while(j<library[i].length) {
				System.out.println(library[i][j]);
				j++;
			}
			i++;
			j=0;
		}
	
	
	}

}
