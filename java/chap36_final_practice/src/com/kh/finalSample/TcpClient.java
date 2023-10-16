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
		tc.serverIP = InetAddress.getLocalHost().getHostAddress(); // �� ��ǻ�� IP �ּҳ־���
		Socket socket = new Socket(tc.serverIP, tc.port);
		System.out.println("����Ƴİ�");
		// Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ������
		BufferedReader in = new BufferedReader  // �����͸� ����
				(new InputStreamReader(socket.getInputStream()));
		OutputStream ots = socket.getOutputStream(); // �����͸� ���
		
		
		// Ŭ���̾�Ʈ���� ������ �޼��� ����
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
