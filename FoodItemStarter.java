class FoodItemStarter{
	public static void main(String args[]){
		
		FoodItem food=new FoodItem();
		
		food.displayDetails("Idli",25.0f,"Ayodhya",2,Type.TIFFIN,"***",OrderType.SELFSERVICE);
		food.printTotalCost();
		food.printTotalProductsCost();
		
		System.out.println();
		
		food.displayDetails("Noodels",50.0f,"Siddi Sai",2,Type.CHAT,"***",OrderType.PARCEL);
		food.printTotalCost();
		food.printTotalProductsCost();
		
	} 
}