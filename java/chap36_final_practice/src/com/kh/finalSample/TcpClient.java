package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class TcpClient {
	int port = 3333;
	String serverIP;
	
	
	public static void main(String[] args) {
		TcpClient tc = new TcpClient();
	try {
		tc.serverIP = InetAddress.getLocalHost().getHostAddress(); // 내 컴퓨터 IP 주소넣어줌
		Socket socket = new Socket(tc.serverIP, tc.port);
		System.out.println("연결됐냐고");
		// 클라이언트와 통신을 위한 입 출력 스트림설정
		BufferedReader in = new BufferedReader  // 데이터를 읽음
				(new InputStreamReader(socket.getInputStream()));
		OutputStream ots = socket.getOutputStream(); // 데이터를 출력
		
		
		// 클라이언트에서 서버로 메세지 전송
		String msg = "hi. server";
		ots.write(msg.getBytes());
		ots.flush();
		
		Scanner sc = new Scanner(in);
		System.out.println("[Clinet] server " + sc.nextLine());
		
		socket.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
	
		
	
	
}
