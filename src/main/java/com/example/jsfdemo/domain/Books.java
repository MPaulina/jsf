package com.example.jsfdemo.domain;

public class Books {
		private String Author;
		private String Tittle;
		private String Yop;
		
		public Books() {
		}
		
		public Books(String author, String tittle, String yop) {
			super();
			Author = author;
			Tittle = tittle;
			Yop = yop;
		}

		public String getAuthor() {
			return Author;
		}

		public void setAuthor(String author) {
			Author = author;
		}

		public String getTittle() {
			return Tittle;
		}

		public void setTittle(String tittle) {
			Tittle = tittle;
		}

		public String getYop() {
			return Yop;
		}

		public void setYop(String yop) {
			Yop = yop;
		}
}
