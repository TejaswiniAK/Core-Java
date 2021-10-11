class MiPhoneStarter{
	public static void main(String[] Mi){
		
		MiPhone phone=new MiPhone();
		
		phone.setMiBrand("Redmi Note 5 Pro");
		System.out.println(phone.brand);
		
		phone.setMiColor("Black");
		System.out.println(phone.color);
		
		phone.setImei("4975976555332");
		System.out.println(phone.imei);
		
		Phonepay pay=new Phonepay();
		phone.setPhonePay(pay);
		
		System.out.println(phone.phonepay);
		System.out.println();
		
		pay.setCompany("Chinese");
		System.out.println(phone.phonepay.company);
		
		pay.setVersion("63.973.97.20");
		System.out.println(phone.phonepay.version);
		
		pay.setArchitect("vcvc ckmckji");
		System.out.println(pay.architect);
		
		pay.setWorking(true);
		System.out.println(pay.working);
		
		
		
	}
}