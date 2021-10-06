class Market{
	int noOfShops;
	String name;
	static String city;
	
	void displayDetails()
	{
		System.out.println(this.noOfShops);
		System.out.println(this.name);
		System.out.println(this.city);
	}
	
	void displayDay(){
		System.out.println("Tuesday");
	}
}