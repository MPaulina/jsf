package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsfdemo.domain.Books;
import com.example.jsfdemo.service.BookManager;

@SessionScoped
@Named("bookF")
public class BookForm implements Serializable {
	private Books book = new Books();

	@Inject
	private BookManager bookManager;
	
	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}
	
	//akcja - dodawanie
	public String addBookA() {
		bookManager.addBook(book); //to idzie z BookManager
		// return ""; jaki widok ma byc nastepny 
		return null; //pozostan na tym samym widoku
		// return "bookList"; // kolejny widok bookList.xhtml
	}
}