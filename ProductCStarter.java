class ProductCStarter{
	public static void main(String[] args){
		
		ProductC p1=new ProductC("Hair Dryer","EC",1800,2,"Philips");
		
		p1.displayDetailes();
		p1.printTotalCost();
		p1.printTotalProductPrice();
		
		System.out.println();
		
		ProductC p2=new ProductC("Trimmer","EC",200,4,"Nova");
		
		p2.displayDetailes();
		p2.printTotalCost();
		p2.printTotalProductPrice();
		
	}
	
}