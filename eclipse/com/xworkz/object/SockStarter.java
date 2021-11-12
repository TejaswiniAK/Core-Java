package com.xworkz.object;

import com.xworkz.object.constants.SockMaterial;
import com.xworkz.object.constants.SockSize;
import com.xworkz.object.constants.SockType;
import com.xworkz.object.methods.Sock;

public class SockStarter {

	public static void main(String[] args) {

		Sock sock =new Sock(SockSize.S, 50.87F, SockMaterial.COTTON, SockType.ANKLE_SOCKS);
		
		System.out.println(sock.toString());
		System.out.println(sock.hashCode());
		
		Sock sock2 = new Sock(SockSize.M, 100.0F, SockMaterial.COTTON, SockType.ANKLE_SOCKS);
		
		System.out.println(sock2.toString());
		System.out.println(sock2.hashCode());
		
		System.out.println(sock.equals(sock2));
		
		Class class1=sock.getClass();
		System.out.println(class1.getCanonicalName());
		System.out.println(class1.getSimpleName());
	}

}
