package com.kh.IAddress.practice;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class PracticeAddress {
	
	public void InetMyExam() {
		
		try {
			InetAddress inet = InetAddress.getByName("www.naver.com");
			
			System.out.println("ȣ��Ʈ �̸� : " + inet.getHostName());
			System.out.println("ȣ��Ʈ IP �ּ� : " + inet.getHostAddress());
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	

	public static void main(String[] args) {
		
		PracticeAddress padd = new PracticeAddress();
		padd.InetMyExam();
		
		
		
		
	}

}
