package com.xworkz.bridge;

import com.xworkz.bridge.hostel.HostelRules;
import com.xworkz.bridge.hostel.SharavatiHostel;

public class HostelScanner {

	public static void main(String[] args) {
/*
		HostelRules hostelRules=new HostelRules() {
			
			@Override
			public int inTime() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		

		HostelRules hostelRules1=new HostelRules() {
			
			@Override
			public String visitingDay() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int inTime() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
*/
		
		
		HostelRules hostelRules=new SharavatiHostel();
		System.out.println(hostelRules.inTime());
		
		SharavatiHostel sharavatiHostel=new SharavatiHostel();
		System.out.println(sharavatiHostel.inTime());
		System.out.println(sharavatiHostel.visitingDay());
		
	}

}
