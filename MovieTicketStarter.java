class MovieTicketStarter{
	public static void main(String movie[]){
		
		MovieTicket m=new MovieTicket();
		
		m.displayDetails("Kotigobba 3","Apsara",150.0f,4,MovieType.AFTERNOON);
		m.printTotalPrice();
		
		System.out.println();
		
		m.displayDetails("ABCD","Vijaya",200.0f,4,MovieType.AFTERNOON);
		m.printTotalPrice();
		
		
	}
}