class ProductStarter{
	public static void main(String[] a){
		Product product=new Product();
		product.pName="Box";
		product.type="Plastic";
		product.quantity=1.2f;
		product.price=200f;
		product.vendor="Soubhiii";
		
		product.displayDetails();
	}
}