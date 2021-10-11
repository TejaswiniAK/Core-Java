class Product{
	String pName;
	String type;
	float quantity;
	float price;
	String vendor;
	
	void displayDetails(){
		System.out.println(this.pName);
		System.out.println(this.type);
		System.out.println(this.quantity);
		System.out.println(this.price);
		System.out.println(this.vendor);
	}
}