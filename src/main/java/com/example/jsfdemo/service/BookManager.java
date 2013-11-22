package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import com.example.jsfdemo.domain.Books;

@ApplicationScoped
public class BookManager {
	private List<Books> db = new ArrayList<Books>();

	public List<Books> getAllBooks() {
		return db;
	}

	public void addBook(Books book) {
		Books book2 = new Books();
		book2.setAuthor(book.getAuthor());
		book2.setTittle(book.getTittle());
		book2.setYop(book.getYop());
		db.add(book2);
	}
}