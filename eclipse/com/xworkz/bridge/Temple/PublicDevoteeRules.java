package com.xworkz.bridge.Temple;

public class PublicDevoteeRules implements DevoteeRule {

	@Override
	public boolean slipperOff() {
		System.out.println("Invoked slipperOff ");
		return true;
	}
	
	@Override
	public boolean takePhotoOff() {
		System.out.println("Invoked takePhotoOff");
		return true;
	}
	
	@Override
	public boolean maintanSilence() {
		System.out.println("Invoked maintanSilence");
		return true;
	}
	
}
