package it.mamino84.example.array;
@SuppressWarnings("unused")

public class ArrayScan {

	public static void main(String[] args) {
		
		int fiboSeq[] = {1, 2, 3, 5, 8, 13, 21};
		
		System.out.println("FOR LOOP - START");
		for(int i=0;i<fiboSeq.length;i++) {
			int val = fiboSeq[i];
			System.out.println("fiboSeq["+i+"] = "+ fiboSeq[i]);
		}
		System.out.println("FOR LOOP - END");
		
		System.out.println();
		
		System.out.println("WHILE LOOP - START");
		int i = 0;
		while (i<fiboSeq.length) {		
			int val = fiboSeq[i];
			System.out.println("fiboSeq["+i+"] = "+ fiboSeq[i]);
			
			i++;
		}		
		System.out.println("WHILE LOOP - END");
		
		
	}

}
