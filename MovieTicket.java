class MovieTicket{
	
	String movieName;
	String theater;
	float price;
	int noOfSeats;
	MovieType type;
	
	void displayDetails(String movieName,String theater,float price,int noOfSeats,MovieType type){
		System.out.println(this.movieName=movieName);
		System.out.println(this.theater=theater);
		System.out.println(this.price=price);
		System.out.println(this.noOfSeats=noOfSeats);
		System.out.println(this.type=type);
	}
	
	void printTotalPrice(){
		float total=this.price*this.noOfSeats;
		System.out.println("Total Price : "+total);
	}
	
}