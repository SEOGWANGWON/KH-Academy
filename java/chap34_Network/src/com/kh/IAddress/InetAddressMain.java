package com.kh.IAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
	public void InetExam() {
		
		try {
			
			// 내가 사용하는 컴퓨터의 InetAddress 객체 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Name : " + localHost.getHostName());
			System.out.println("Local IP Address : " + localHost.getHostAddress());
			
			
			// 호스트 이름 이용해서 객체 생성
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP 주소 출력
			System.out.println("Host Name : " + address.getHostName());
			System.out.println("IP Address : " + address.getHostAddress());
			
			InetAddress add2 = InetAddress.getByName("www.naver.com");
			
			// IP 주소 출력
			System.out.println("Host Name : " + add2.getHostName());
			System.out.println("IP Address : " + add2.getHostAddress());
			
			InetAddress add3 = InetAddress.getByName("www.daum.net");
			
			// IP 주소 출력
			System.out.println("Host Name : " + add3.getHostName());
			System.out.println("IP Address : " + add3.getHostAddress());
			
			InetAddress add4 = InetAddress.getByName("www.twtich.tv");
			
			// IP 주소 출력
			System.out.println("Host Name : " + add4.getHostName());
			System.out.println("IP Address : " + add4.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void InetSample() {
		try {
			InetAddress address = InetAddress.getByName("www.google.com");
			
			// IP 주소를 byte 배열로 얻기
			// InetyAddress 객체에서 IP 주소를 바이트 배열로 얻음
			// IP 주소를 바이트 배열로 얻으면 각 바이트를 통해 IP 주소를 다룰수 있음
			byte[] ipAddress = address.getAddress();
			System.out.println("IP Address bytes로 얻음");
			for(byte ip : ipAddress) {
				System.out.print(ip+".");
			}
			System.out.println();
			
			// 도메인 명에 지정된 모든 호스트의 IP 주소를 배열로 얻기
			InetAddress[] alladdress = InetAddress.getAllByName("www.google.com");
			System.out.print("구글에 지정된 모든 호스트의 아이피 주소를 배열로 얻음 : ");
			for(InetAddress addr : alladdress) {
				System.out.println(addr.getHostAddress());
			}
			// 호스트 이름 얻기
			String hostName = address.getHostName();
			System.out.println("Host Name : " + hostName);
			
			// 지역 호스트의 IP 주소를 얻기
			InetAddress localHost = InetAddress.getLocalHost();
			System.out.println("Local Host Address : " + localHost.getHostAddress());
			
			// 멀티 캐스트 주소 여부 확인
			boolean isMultiCast = address.isMulticastAddress();
			System.out.println("멀티 캐스트 주소입니까? " + isMultiCast);
			
			// 호스트 이름을 이용해서 InetAddress 객체 생성
			InetAddress name = InetAddress.getByName("www.naver.com");
			System.out.println("IP 주소 이름 : " + name.getHostAddress());
			
			// 호스트의 완전한 이름 가져오기 ( 전체 도메인 이름 )
			// 호스트의 정규화된 (FQDN) 도메인의 이름을 얻음
			// FQDN : Full Qualified Domain Name
			String hostFullName = address.getCanonicalHostName();
			System.out.println("풀네임 :  " + hostFullName);
			
			// LookPask 주소 여부 확인
			boolean isLookpack = address.isLoopbackAddress();
			System.out.println("룩팩입니까? : " + isLookpack);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		InetAddressMain inetMain = new InetAddressMain();
		inetMain.InetSample();
		
		
	}

}
