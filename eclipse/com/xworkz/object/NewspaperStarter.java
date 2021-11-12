package com.xworkz.object;

import com.xworkz.object.methods.Newspaper;

public class NewspaperStarter {

	public static void main(String[] args) {

		Newspaper news = new Newspaper();

		String news1 = news.toString();
		System.out.println(news1);

		int news2 = news.hashCode();
		System.out.println(news2);

		Newspaper news3 = new Newspaper();

		news.setLang("English");
		news3.setLang("English");

		news.setName("Deccan");
		news3.setName("Deccan");

		System.out.println(news.equals(news3));
	}

}
