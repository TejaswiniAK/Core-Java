class MarketStarter{
	public static void main(String Soubhiii[]){
		Market market=new Market();
		market.noOfShops=19;
		market.name="Mahantha Swami Market Dharwad";
		market.city="Dharwad";
		market.displayDetails();
		
		System.out.println();
		
		Market market1=new Market();
		market1.noOfShops=36;
		market1.name="Dhurgada Bayal";
		market1.city="Hubli";
		market1.displayDetails();
		
		System.out.println();
		
		market1.displayDay();
	}
}