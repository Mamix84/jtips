package it.mamino84.example.array;
@SuppressWarnings("unused")

public class ArrayAccess {

	public void directAccess() {
		
		int fiboSeq[] = {1, 2, 3, 5, 8, 13, 21};
		
		int firstElem = fiboSeq[0]; //1
		
		int lastElem = fiboSeq[6]; //21
		
		int outOfBound = fiboSeq[10]; //ArrayIndexOutOfBoundsException		
		
	}
}
