class SugerFactoryStarter{
	public static void main(String a[]){
	
	SugarFactory ref = new SugarFactory();
	ref.capacity=50;
	System.out.println(ref.capacity);
	System.out.println(ref.machine);
	
	ref.machine=new Machine();
	/* ref.machine.working=true; -->(output: true)*/
	System.out.println(ref.machine.working);
	}
}