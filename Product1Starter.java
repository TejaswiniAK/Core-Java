class Product1Starter{
	public static void main(String[] a){
		
		Product1 p=new Product1();
		
		p.displayDetails("Book",3.0f,2,"Tejaswini");
		p.printTotalCost();
		p.printTotalProductsCost();
		
		System.out.println();
		
		p.displayDetails("Box",4.0f,2,"Soubhiii");
		p.printTotalCost();
		p.printTotalProductsCost();
	}
}