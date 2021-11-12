package com.xworkz.object.methods;

public class Ipod {

	// By default Ipod has 11 methods. Because Ipod class Implicitly has parent
	// as Object. An object is a superclass.
	// So Object has by default 11 methods like
	/*
	 * 1. clone() 2. equals(Object obj) 3. finalize() 4. getClass() 5.
	 * hashCode() 6. notify() 7. notifyAll() 8. toString() 9. wait() 10.
	 * wait(long timeout) 11. wait(long timeout, int nanos)
	 */

	private String modelNo;

	@Override
	public String toString() {
		System.out.println("Invoked toString() method from Ipod");
		return "Computer";// return super.toString();--> It implicitly calls
							// hashCode() method.
	}
	
	@Override
	public int hashCode() {
		System.out.println("Invoked hashCode() method from Ipod");
		return 12345;//super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked equals() method from Ipod");
		if(obj==null){
			System.err.println("Enter object type");
			return false;
		}
		if(obj instanceof Ipod){
			System.out.println("Ipod type is correct...");
			Ipod check=(Ipod)obj;
			
			//String modelNum=check.getModelNo();
			//System.out.println(modelNum);
			//if(this.modelNo.equals(modelNum))
			
			if(this.modelNo.equals(check.modelNo)){
				System.out.println("model is same");
				return true;
			}
			else {
				System.err.println("model not same");
			}
		}
		else {
			System.err.println("Enter Ipod type...");
		}
		return false;//super.equals(obj);
	}
	
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
	public String getModelNo() {
		return this.modelNo;
	}
	
}
