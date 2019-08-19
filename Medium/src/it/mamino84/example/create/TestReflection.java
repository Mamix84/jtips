package it.mamino84.example.create;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("all")
public class TestReflection {
	
	public static void main (String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		newInstanceReflection();
	}

	@SuppressWarnings("unused")
	
	public static void newInstanceReflection () {
		
		Constructor constructor = Book.class.getConstructors()[0];
		constructor.setAccessible(true);		
		
		try {
			
			Book bookRefelcted = (Book) constructor.newInstance(null);
			
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
