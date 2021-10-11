class Product1{
	String name;
	float price;
	int quantity;
	String vendor;
	static float totalProductCost;
	
	void displayDetails(String name,float price,int quantity,String vendor){
		System.out.println("Invoked display detials");
		System.out.println(this.name=name);
		System.out.println(this.price=price);
		System.out.println(this.quantity=quantity);
		System.out.println(this.vendor=vendor);
	}
	void printTotalCost(){
		float total=this.price*this.quantity;
		System.out.println("Total Cost : "+total);
		
		totalProductCost=totalProductCost+total;
		
	}
	static void printTotalProductsCost(){
		System.out.println("Total product Price : "+totalProductCost);
	}
}