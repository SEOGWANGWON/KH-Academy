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
		System.out.println(ts.port +"���� ���� ��ٸ�����");
		while(true) {
			Socket client = ts.server.accept();
			System.out.println("�������");
			InputStream ins = client.getInputStream();
			Scanner sc = new Scanner(ins);
			System.out.println("���뿡�� ������ �޼��� : " + sc.nextLine());
			
			OutputStream ots = client.getOutputStream();
			PrintStream pts = new PrintStream(ots);
			pts.print("��?");
			System.out.println( "hi");
			client.close();
			System.out.println("Server ��������");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}
}
