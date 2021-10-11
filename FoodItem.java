class FoodItem{
	String name;
	float price;
	String hotelName;
	int quantity;
	Type t;
	String rating;
	OrderType order;
	static float totalProductCost;
	
	void displayDetails(String name,float price,String hotelName,int quantity,Type t,String rating,OrderType order){
		System.out.println(this.name=name);
		System.out.println(this.price=price);
		System.out.println(this.hotelName=hotelName);
		System.out.println(this.quantity=quantity);
		System.out.println(this.t=t);
		System.out.println(this.rating=rating);
		System.out.println(this.order=order);
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