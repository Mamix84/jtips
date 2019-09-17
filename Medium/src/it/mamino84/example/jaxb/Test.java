package it.mamino84.example.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import it.mamino84.example.linkedlist.LinkedList;
import it.mamino84.example.model.XmlBook;

public class Test {

	public static void main(String[] args) {

		XmlBook inferno = new XmlBook("La Divina Commedia - Inferno", "Dante", 1238);
		XmlBook purgatorio = new XmlBook("Purgatorio", "Dante", 1204);
		XmlBook paradiso = new XmlBook("Pradiso", "Dante", 1176);

		LinkedList list = new LinkedList();

		list.addLast(inferno);
		list.addLast(purgatorio);
		list.addLast(paradiso);

		try {
			JAXBContext jaxbcontext = JAXBContext.newInstance(LinkedList.class, XmlBook.class);

			String listXml = marshall(list, jaxbcontext);

			System.out.print("BOOK (xml format): " + listXml);
			
			LinkedList newList = unmarshal(listXml, jaxbcontext);
			
			for(Object book : newList) {
				System.out.println(book.toString());
			}

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

	private static LinkedList unmarshal(String listXml, JAXBContext jaxbcontext) {
		
		LinkedList list = null;
		
		try {
			Unmarshaller unmarshaller = jaxbcontext.createUnmarshaller();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	private static String marshall(LinkedList list, JAXBContext jaxbcontext) {
		
		String output = "";
		
		try {
			Marshaller marshaller = jaxbcontext.createMarshaller();	
			
			marshaller.marshal(list, System.out); 
			
			output = System.out.toString();
				
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return output;
	}
	


}
