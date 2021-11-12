package com.xworkz.object.methods;

public class Newspaper {

	private String name;
	private String lang;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "new";// super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 98;// super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() of Object");
		if (obj != null) {
			if (obj instanceof Newspaper) {
				Newspaper news = (Newspaper) obj;
				String lang1 = news.getLang();
				String name1 = news.getName();
				if (this.lang.equals(lang1) && this.name.equals(name1)) {
					System.out.println("language and name matched");
					return true;
				}
			}
		}
		return false;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getName() {
		return name;
	}

	public String getLang() {
		return lang;
	}
}