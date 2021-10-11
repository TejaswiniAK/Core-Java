class ProductC{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductPrice;
	
	ProductC(String name,String type,float price,int quantity,String vendor){
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
		System.out.println("Invoked 5 parameters...");
	}
	
	ProductC(String name,float price,int quantity){
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		System.out.println("Invoked 3 parameter...");
	}
	
	void displayDetailes(){
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
	
	void printTotalCost(){
		float total=this.price*this.quantity;
		System.out.println("TOTAL COST : "+total);
		
		totalProductPrice=totalProductPrice+total;
		
	}
	
	static void printTotalProductPrice(){
		System.out.println("TOTAL PRODUCTS PRICE : "+totalProductPrice);
	}
	
}