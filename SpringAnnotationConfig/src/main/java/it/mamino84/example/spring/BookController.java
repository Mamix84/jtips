package it.mamino84.example.spring;

import org.springframework.stereotype.Controller;

@Controller
public class BookController {

	public BookController() {
		System.out.println("Book Controller Bean created by annotation...");

	}
}
