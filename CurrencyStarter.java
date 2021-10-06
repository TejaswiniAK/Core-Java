class CurrencyStarter{
	public static void main(String[] Varshiii){
		Currency currency=new Currency();
		
		System.out.println(currency.country);
		currency.name="$";
		currency.value=32;
		currency.displayDetails();
		
		currency.country.name="India";
		currency.country.code="+91";
		
		currency.country.displayDetails();
		
	}
}