package it.mamino84.example.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class XmlBook {

	private String title;
	private String author;
	private int pageNumber;

	public XmlBook() {
		super();
	}

	public XmlBook(String title, String author, int pageNumber) {
		super();
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String toString() {
		return "Title: " + title + " - Author: " + author + " - Page number: " + pageNumber;
	}

}
