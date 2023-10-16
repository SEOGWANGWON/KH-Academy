package com.kh.finalSample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpServer {
	int port = 3333;
	
	ServerSocket server;
	
	public static void main(String[] args) {
		TcpServer ts = new TcpServer();
	try {
		ts.server = new ServerSocket(ts.port);
		System.out.println(ts.port +"에서 연결 기다리는중");
		while(true) {
			Socket client = ts.server.accept();
			System.out.println("연결됐음");
			InputStream ins = client.getInputStream();
			Scanner sc = new Scanner(ins);
			System.out.println("깡통에게 보내는 메세지 : " + sc.nextLine());
			
			OutputStream ots = client.getOutputStream();
			PrintStream pts = new PrintStream(ots);
			pts.print("음?");
			System.out.println( "hi");
			client.close();
			System.out.println("Server 연결해제");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
}
