package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.jsfdemo.domain.Alcohol;

public class AlcoholManager {
	private List<Alcohol> db = new ArrayList<Alcohol>();
	
	public List<Alcohol> getAllAlcohols() {
		return db;
	}
	
	public void addAlcohol(Alcohol alko) {
		Alcohol alko2 = new Alcohol();
		alko2.setType(alko.getType());
		alko2.setName(alko.getName());
		alko2.setQuantun(alko.getQuantun());
		alko2.setCapacity(alko.getCapacity());
		alko2.setProcentFree(alko.isProcentFree());
		db.add(alko2);
	}
	
	public void showAllAlcohol() {
		for(int i = 0; i < db.size(); i++)
			System.out.println(db.get(i));
	}
	
	public void removeTheAlcohol() {
		
	}
	
	public void searchTheAlcohol() {
		
	}
	
}
