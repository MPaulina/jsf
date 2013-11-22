package com.example.jsfdemo.web;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import com.example.jsfdemo.domain.Alcohol;
import com.example.jsfdemo.service.AlcoholManager;

@SessionScoped
@Named("alcoholF")
public class AlcoholFormBean implements Serializable {
	private Alcohol alko = new Alcohol();

	@Inject
	private AlcoholManager alcoholManager;
	
	public Alcohol getAlcohol() {
		return alko;
	}

	public void setAlcohol(Alcohol alko) {
		this.alko = alko;
	}
	
	//akcja - dodawanie
	public String addAlcoholA() {
		alcoholManager.addAlcohol(alko);
		// return ""; jaki widok ma byc nastepny 
		return null; //pozostan na tym samym widoku
		// return "bookList"; // kolejny widok bookList.xhtml
	}
}